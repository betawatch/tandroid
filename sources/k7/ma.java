package k7;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
