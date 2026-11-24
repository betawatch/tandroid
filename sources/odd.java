// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes3.dex */
public abstract class odd {
    public static final Object a = new Object();
    public static int b;
    public static boolean c;

    public static void a() {
        synchronized (a) {
            if (c) {
                return;
            }
            c = true;
            Thread thread = new Thread(new cza((byte) 18), "widget-engine-memory");
            thread.setDaemon(true);
            thread.start();
        }
    }
}
