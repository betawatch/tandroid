package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class i2 extends fe.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public i2(jd.c cVar, jd.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        j2 j2Var = j2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(jd.d.a) instanceof b0) {
            return;
        }
        Object k10 = fe.a.k(hVar, null);
        fe.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(jd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new hd.d(hVar, obj));
    }

    @Override // fe.s, ae.w1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            hd.d dVar = (hd.d) this.e.get();
            if (dVar != null) {
                fe.a.f((jd.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r10 = g0.r(obj);
        jd.c cVar = this.d;
        jd.h context = cVar.getContext();
        Object k10 = fe.a.k(context, null);
        i2 v = k10 != fe.a.f ? g0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
            if (v == null || v.M()) {
                fe.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                fe.a.f(context, k10);
            }
            throw th2;
        }
    }
}
