// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public abstract class aff {
    public static xye a;

    public static synchronized sef a(gef gefVar) {
        sef sefVar;
        synchronized (aff.class) {
            xye xyeVar = a;
            if (xyeVar == null) {
                xyeVar = new xye((byte) 4);
                a = xyeVar;
            }
            sefVar = (sef) xyeVar.c(gefVar);
        }
        return sefVar;
    }

    public static synchronized sef b() {
        sef a2;
        synchronized (aff.class) {
            a2 = a(new gef());
        }
        return a2;
    }
}
