class MyThread extends Thread {
    @Override
    public void run() {
        for(int i=0; i<4; i++){
            System.out.println("Name of Thread running: " + Thread.currentThread().getName());
        }
        try{
            Thread.sleep(1000);
        } catch(InterruptedException ex){
            ex.printStackTrace();
        }
    }

    public static void main(String args[]) {
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();
        System.out.println("Name of t1:" + t1.getName());
        System.out.println("Name of t2:" + t2.getName());
        System.out.println("id of t1:" + t1.getId());

        t1.start();
        t2.start();

        t1.setName("STIW3054");
        System.out.println("After changing name of t1:" + t1.getName());
    }
}
