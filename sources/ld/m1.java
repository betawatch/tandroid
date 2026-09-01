package ld;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public final class m1 extends k1 {
    public final u1 e;
    public final n1 f;
    public final q h;
    public final Object n;

    public m1(u1 u1Var, n1 n1Var, q qVar, Object obj) {
        this.e = u1Var;
        this.f = n1Var;
        this.h = qVar;
        this.n = obj;
    }

    @Override // ld.d1
    public final void a(Throwable th2) {
        q D = u1.D(this.h);
        u1 u1Var = this.e;
        n1 n1Var = this.f;
        Object obj = this.n;
        if (D != null) {
            while (e0.n(D.e, false, new m1(u1Var, n1Var, D, obj), 1) == w1.a) {
                D = u1.D(D);
                if (D == null) {
                }
            }
            return;
        }
        u1Var.f(u1Var.o(n1Var, obj));
    }
}
