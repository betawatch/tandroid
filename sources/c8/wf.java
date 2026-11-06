package c8;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes.dex */
public abstract class wf {
    public static a8.za a;

    public static synchronized uf a(qf qfVar) {
        uf ufVar;
        synchronized (wf.class) {
            try {
                if (a == null) {
                    a = new a8.za(1);
                }
                ufVar = (uf) a.R0(qfVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ufVar;
    }

    public static synchronized uf b() {
        uf a10;
        synchronized (wf.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a10 = a(new qf());
        }
        return a10;
    }
}
