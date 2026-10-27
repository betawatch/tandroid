package ce;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes.dex */
public final class h2 extends he.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2(ld.c cVar, ld.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        i2 i2Var = i2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(ld.d.a) instanceof a0) {
            return;
        }
        Object k10 = he.a.k(hVar, null);
        he.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(ld.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new jd.d(hVar, obj));
    }

    @Override // he.s, ce.v1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            jd.d dVar = (jd.d) this.e.get();
            if (dVar != null) {
                he.a.f((ld.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r6 = f0.r(obj);
        ld.c cVar = this.d;
        ld.h context = cVar.getContext();
        Object k10 = he.a.k(context, null);
        h2 v = k10 != he.a.f ? f0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r6);
            if (v == null || v.M()) {
                he.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                he.a.f(context, k10);
            }
            throw th2;
        }
    }
}
