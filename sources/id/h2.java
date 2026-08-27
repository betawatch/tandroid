package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public final class h2 extends nd.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public h2(rc.c cVar, rc.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        i2 i2Var = i2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(rc.d.a) instanceof a0) {
            return;
        }
        Object k10 = nd.a.k(hVar, null);
        nd.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z10 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z10;
    }

    public final void N(rc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new pc.d(hVar, obj));
    }

    @Override // nd.s, id.v1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            pc.d dVar = (pc.d) this.e.get();
            if (dVar != null) {
                nd.a.f((rc.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r10 = f0.r(obj);
        rc.c cVar = this.d;
        rc.h context = cVar.getContext();
        Object k10 = nd.a.k(context, null);
        h2 v = k10 != nd.a.f ? f0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
            if (v == null || v.M()) {
                nd.a.f(context, k10);
            }
        } catch (Throwable th) {
            if (v == null || v.M()) {
                nd.a.f(context, k10);
            }
            throw th;
        }
    }
}
