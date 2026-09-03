package l7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public abstract class na {
    public static h7.r a;

    public static synchronized la a(ha haVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (a == null) {
                    a = new h7.r(3);
                }
                laVar = (la) a.F(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return laVar;
    }

    public static synchronized la b() {
        la a2;
        synchronized (na.class) {
            byte b10 = (byte) (((byte) 1) | 2);
            if (b10 != 3) {
                StringBuilder sb = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
            }
            a2 = a(new ha());
        }
        return a2;
    }
}
