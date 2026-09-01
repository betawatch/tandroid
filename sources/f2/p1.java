package f2;

import java.util.ArrayList;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes.dex */
public abstract class p1 extends u0 {
    public boolean m;
    public boolean n;

    public p1() {
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
    public boolean a(m1 m1Var, c5.e eVar, c5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.a) != (i11 = eVar2.a) || eVar.b != eVar2.b || this.n)) {
            return r(m1Var, eVar, i10, eVar.b, i11, eVar2.b);
        }
        p(m1Var);
        return true;
    }

    public abstract void p(m1 m1Var);

    public abstract boolean q(m1 m1Var, m1 m1Var2, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(m1 m1Var, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(m1 m1Var, c5.e eVar);

    public boolean t(m1 m1Var) {
        return !this.m || m1Var.h();
    }

    public final void u(m1 m1Var) {
        w(m1Var);
        d(m1Var);
    }

    public final void v(m1 m1Var) {
        x(m1Var);
        d(m1Var);
    }

    public void y() {
    }

    public void w(m1 m1Var) {
    }

    public void x(m1 m1Var) {
    }
}
