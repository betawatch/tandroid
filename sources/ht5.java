// default package

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes.dex */
public final class ht5 extends ft5 {
    public final pt5 e;
    public final it5 f;
    public final gg2 h;
    public final Object n;

    public ht5(pt5 pt5Var, it5 it5Var, gg2 gg2Var, Object obj) {
        this.e = pt5Var;
        this.f = it5Var;
        this.h = gg2Var;
        this.n = obj;
    }

    @Override // ft5
    public final boolean k() {
        return false;
    }

    @Override // ft5
    public final void l(Throwable th) {
        gg2 gg2Var = this.h;
        gg2 E = pt5.E(gg2Var);
        pt5 pt5Var = this.e;
        it5 it5Var = this.f;
        Object obj = this.n;
        if (E == null || !pt5Var.O(it5Var, E, obj)) {
            it5Var.a.c(new c56(2), 2);
            gg2 E2 = pt5.E(gg2Var);
            if (E2 == null || !pt5Var.O(it5Var, E2, obj)) {
                pt5Var.f(pt5Var.p(it5Var, obj));
            }
        }
    }
}
