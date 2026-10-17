package n6;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class m implements k {
    public static m b;
    public static final n c = new n(0, 0, 0, false, false);
    public Object a;

    public /* synthetic */ m(Object obj) {
        this.a = obj;
    }

    public static synchronized m a() {
        m mVar;
        synchronized (m.class) {
            try {
                if (b == null) {
                    b = new m();
                }
                mVar = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return mVar;
    }

    @Override // n6.k
    public Object b(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
