package e7;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class t {
    public static s a;

    public static synchronized r d(o oVar) {
        r rVar;
        synchronized (t.class) {
            try {
                if (a == null) {
                    a = new s(0);
                }
                rVar = (r) a.G(oVar);
            } catch (Throwable th) {
                throw th;
            }
        }
        return rVar;
    }

    public void b() {
    }

    public void c(androidx.biometric.t tVar) {
    }

    public void a(int i10, CharSequence charSequence) {
    }
}
