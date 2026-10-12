package be;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final class n1 extends l1 {
    public final v1 e;
    public final o1 f;
    public final q h;
    public final Object n;

    public n1(v1 v1Var, o1 o1Var, q qVar, Object obj) {
        this.e = v1Var;
        this.f = o1Var;
        this.h = qVar;
        this.n = obj;
    }

    @Override // be.e1
    public final void a(Throwable th2) {
        q D = v1.D(this.h);
        v1 v1Var = this.e;
        o1 o1Var = this.f;
        Object obj = this.n;
        if (D != null) {
            while (f0.n(D.e, false, new n1(v1Var, o1Var, D, obj), 1) == x1.a) {
                D = v1.D(D);
                if (D == null) {
                }
            }
            return;
        }
        v1Var.b(v1Var.o(o1Var, obj));
    }
}
