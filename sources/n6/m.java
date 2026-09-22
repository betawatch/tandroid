package n6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
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
    public Object l(com.google.android.gms.common.api.q qVar) {
        m8.d dVar = (m8.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
