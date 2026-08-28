package g7;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class ma {
    public static d7.s a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (a == null) {
                    a = new d7.s(2);
                }
                kaVar = (ka) a.G(haVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaVar;
    }
}
