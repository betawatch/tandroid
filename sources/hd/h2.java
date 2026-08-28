package hd;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public final class h2 extends md.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2(qc.c cVar, qc.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        i2 i2Var = i2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(qc.d.a) instanceof a0) {
            return;
        }
        Object k10 = md.a.k(hVar, null);
        md.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(qc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new oc.d(hVar, obj));
    }

    @Override // md.s, hd.v1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            oc.d dVar = (oc.d) this.e.get();
            if (dVar != null) {
                md.a.f((qc.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r10 = f0.r(obj);
        qc.c cVar = this.d;
        qc.h context = cVar.getContext();
        Object k10 = md.a.k(context, null);
        h2 v = k10 != md.a.f ? f0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
            if (v == null || v.M()) {
                md.a.f(context, k10);
            }
        } catch (Throwable th) {
            if (v == null || v.M()) {
                md.a.f(context, k10);
            }
            throw th;
        }
    }
}
