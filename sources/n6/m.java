package n6;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
