package be;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes.dex */
public final class h2 extends ge.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2(kd.c cVar, kd.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        i2 i2Var = i2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(kd.d.a) instanceof a0) {
            return;
        }
        Object k10 = ge.a.k(hVar, null);
        ge.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(kd.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new id.d(hVar, obj));
    }

    @Override // ge.s, be.v1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            id.d dVar = (id.d) this.e.get();
            if (dVar != null) {
                ge.a.f((kd.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r10 = f0.r(obj);
        kd.c cVar = this.d;
        kd.h context = cVar.getContext();
        Object k10 = ge.a.k(context, null);
        h2 v = k10 != ge.a.f ? f0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
            if (v == null || v.M()) {
                ge.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                ge.a.f(context, k10);
            }
            throw th2;
        }
    }
}
