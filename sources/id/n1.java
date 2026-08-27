package id;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
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

    @Override // id.e1
    public final void a(Throwable th) {
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
        v1Var.f(v1Var.o(o1Var, obj));
    }
}
