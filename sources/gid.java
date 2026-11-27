// default package

/* compiled from: r8-map-id-ccfa8252b9f089ebf7f3997b8d474d49dee05081d92c50e51a64afeb13131fbb */
/* loaded from: classes3.dex */
public abstract class gid {
    public static final Object a = new Object();
    public static int b;
    public static boolean c;

    public static void a() {
        synchronized (a) {
            if (c) {
                return;
            }
            c = true;
            Thread thread = new Thread(new osa((byte) 21), "widget-engine-memory");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
