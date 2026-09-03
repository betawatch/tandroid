package f2;

import java.util.ArrayList;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes.dex */
public abstract class o1 extends t0 {
    public boolean m;
    public boolean n;

    public o1() {
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

    @Override // f2.t0
    public boolean a(l1 l1Var, c5.e eVar, c5.e eVar2) {
        int i10;
        int i11;
        if (eVar != null && ((i10 = eVar.a) != (i11 = eVar2.a) || eVar.b != eVar2.b || this.n)) {
            return r(l1Var, eVar, i10, eVar.b, i11, eVar2.b);
        }
        p(l1Var);
        return true;
    }

    public abstract void p(l1 l1Var);

    public abstract boolean q(l1 l1Var, l1 l1Var2, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(l1 l1Var, c5.e eVar, int i10, int i11, int i12, int i13);

    public abstract void s(l1 l1Var, c5.e eVar);

    public boolean t(l1 l1Var) {
        return !this.m || l1Var.h();
    }

    public final void u(l1 l1Var) {
        w(l1Var);
        d(l1Var);
    }

    public final void v(l1 l1Var) {
        x(l1Var);
        d(l1Var);
    }

    public void y() {
    }

    public void w(l1 l1Var) {
    }

    public void x(l1 l1Var) {
    }
}
