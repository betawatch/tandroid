package ae;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final class o1 extends m1 {
    public final w1 e;
    public final p1 f;
    public final q h;
    public final Object n;

    public o1(w1 w1Var, p1 p1Var, q qVar, Object obj) {
        this.e = w1Var;
        this.f = p1Var;
        this.h = qVar;
        this.n = obj;
    }

    @Override // ae.f1
    public final void a(Throwable th2) {
        q D = w1.D(this.h);
        w1 w1Var = this.e;
        p1 p1Var = this.f;
        Object obj = this.n;
        if (D != null) {
            while (g0.n(D.e, false, new o1(w1Var, p1Var, D, obj), 1) == y1.a) {
                D = w1.D(D);
                if (D == null) {
                }
            }
            return;
        }
        w1Var.f(w1Var.o(p1Var, obj));
    }
}
