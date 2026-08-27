package h7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class ma {
    public static e7.s a;

    public static synchronized ka a(ha haVar) {
        ka kaVar;
        synchronized (ma.class) {
            try {
                if (a == null) {
                    a = new e7.s(2);
                }
                kaVar = (ka) a.G(haVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return kaVar;
    }
}
