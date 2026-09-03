package k7;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class ma {
    public static h7.r a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (a == null) {
                    a = new h7.r(2);
                }
                kaVar = (ka) a.F(haVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return kaVar;
    }
}
