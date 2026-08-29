package f2;

import java.util.ArrayList;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes.dex */
public abstract class q1 extends u0 {
    public boolean m;
    public boolean n;

    public q1() {
        this.a = null;
        this.b = new ArrayList();
        this.c = 120L;
        this.d = 120L;
        this.e = 250L;
        this.f = 250L;
        this.g = 250L;
        this.l = 0L;
        this.m = true;
    }

    @Override // f2.u0
    public boolean a(n1 n1Var, a5.e eVar, a5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.a) != (i11 = eVar2.a) || eVar.b != eVar2.b || this.n)) {
            return r(n1Var, eVar, i10, eVar.b, i11, eVar2.b);
        }
        p(n1Var);
        return true;
    }

    public abstract void p(n1 n1Var);

    public abstract boolean q(n1 n1Var, n1 n1Var2, a5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(n1 n1Var, a5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(n1 n1Var, a5.e eVar);

    public boolean t(n1 n1Var) {
        return !this.m || n1Var.h();
    }

    public final void u(n1 n1Var) {
        w(n1Var);
        d(n1Var);
    }

    public final void v(n1 n1Var) {
        x(n1Var);
        d(n1Var);
    }

    public void y() {
    }

    public void w(n1 n1Var) {
    }

    public void x(n1 n1Var) {
    }
}
