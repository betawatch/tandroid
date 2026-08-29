package jd;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public final class g2 extends od.t {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g2(sc.c cVar, sc.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        h2 h2Var = h2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(sc.d.a) instanceof a0) {
            return;
        }
        Object k9 = od.a.k(hVar, null);
        od.a.f(hVar, k9);
        N(hVar, k9);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(sc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new qc.d(hVar, obj));
    }

    @Override // od.t, jd.u1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            qc.d dVar = (qc.d) this.e.get();
            if (dVar != null) {
                od.a.f((sc.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r6 = e0.r(obj);
        sc.c cVar = this.d;
        sc.h context = cVar.getContext();
        Object k9 = od.a.k(context, null);
        g2 v = k9 != od.a.f ? e0.v(cVar, context, k9) : null;
        try {
            this.d.resumeWith(r6);
            if (v == null || v.M()) {
                od.a.f(context, k9);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                od.a.f(context, k9);
            }
            throw th2;
        }
    }
}
