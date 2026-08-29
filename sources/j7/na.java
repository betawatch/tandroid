package j7;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class na {
    public static f7.s a;

    public static synchronized la a(ha haVar) {
        la laVar;
        synchronized (na.class) {
            try {
                if (a == null) {
                    a = new f7.s(3);
                }
                laVar = (la) a.G(haVar);
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
                StringBuilder sb2 = new StringBuilder();
                if ((b10 & 1) == 0) {
                    sb2.append(" enableFirelog");
                }
                if ((b10 & 2) == 0) {
                    sb2.append(" firelogEventType");
                }
                throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
            }
            a2 = a(new ha());
        }
        return a2;
    }
}
