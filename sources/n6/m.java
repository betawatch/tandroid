package n6;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
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
    public Object e(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
