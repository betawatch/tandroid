package ld;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes.dex */
public final class g2 extends qd.s {
    public final ThreadLocal e;
    private volatile boolean threadLocalIsSet;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public g2(uc.c cVar, uc.h hVar) {
        super(cVar, hVar.get(r0) == null ? hVar.plus(r0) : hVar);
        h2 h2Var = h2.a;
        this.e = new ThreadLocal();
        if (cVar.getContext().get(uc.d.a) instanceof a0) {
            return;
        }
        Object k10 = qd.a.k(hVar, null);
        qd.a.f(hVar, k10);
        N(hVar, k10);
    }

    public final boolean M() {
        boolean z4 = this.threadLocalIsSet && this.e.get() == null;
        this.e.remove();
        return !z4;
    }

    public final void N(uc.h hVar, Object obj) {
        this.threadLocalIsSet = true;
        this.e.set(new sc.d(hVar, obj));
    }

    @Override // qd.s, ld.u1
    public final void g(Object obj) {
        if (this.threadLocalIsSet) {
            sc.d dVar = (sc.d) this.e.get();
            if (dVar != null) {
                qd.a.f((uc.h) dVar.a, dVar.b);
            }
            this.e.remove();
        }
        Object r10 = e0.r(obj);
        uc.c cVar = this.d;
        uc.h context = cVar.getContext();
        Object k10 = qd.a.k(context, null);
        g2 v = k10 != qd.a.f ? e0.v(cVar, context, k10) : null;
        try {
            this.d.resumeWith(r10);
            if (v == null || v.M()) {
                qd.a.f(context, k10);
            }
        } catch (Throwable th2) {
            if (v == null || v.M()) {
                qd.a.f(context, k10);
            }
            throw th2;
        }
    }
}
