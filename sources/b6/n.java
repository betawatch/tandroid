package b6;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class n implements l {
    public static n b;
    public static final o c = new o(0, 0, 0, false, false);
    public Object a;

    public static synchronized n a() {
        n nVar;
        synchronized (n.class) {
            try {
                if (b == null) {
                    b = new n();
                }
                nVar = b;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return nVar;
    }

    @Override // b6.l
    public Object f(com.google.android.gms.common.api.q qVar) {
        a8.d dVar = (a8.d) this.a;
        dVar.a = qVar;
        return dVar;
    }
}
