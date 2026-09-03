package j7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class g9 {
    public static h7.r a;

    public static int a(Object obj) {
        return (int) (Integer.rotateLeft((int) ((obj == null ? 0 : obj.hashCode()) * (-862048943)), 15) * 461845907);
    }

    public static synchronized c9 b(z8 z8Var) {
        c9 c9Var;
        synchronized (g9.class) {
            try {
                if (a == null) {
                    a = new h7.r(1);
                }
                c9Var = (c9) a.F(z8Var);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9Var;
    }
}
