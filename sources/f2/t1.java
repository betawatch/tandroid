package f2;

import java.util.ArrayList;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes.dex */
public abstract class t1 extends w0 {
    public boolean m;
    public boolean n;

    public t1() {
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

    @Override // f2.w0
    public boolean a(q1 q1Var, d5.p pVar, d5.p pVar2) {
        int i9;
        int i10;
        if (pVar != null && ((i9 = pVar.a) != (i10 = pVar2.a) || pVar.b != pVar2.b || this.n)) {
            return r(q1Var, pVar, i9, pVar.b, i10, pVar2.b);
        }
        p(q1Var);
        return true;
    }

    public abstract void p(q1 q1Var);

    public abstract boolean q(q1 q1Var, q1 q1Var2, d5.p pVar, int i9, int i10, int i11, int i12);

    public abstract boolean r(q1 q1Var, d5.p pVar, int i9, int i10, int i11, int i12);

    public abstract void s(q1 q1Var, d5.p pVar);

    public boolean t(q1 q1Var) {
        return !this.m || q1Var.h();
    }

    public final void u(q1 q1Var) {
        w(q1Var);
        d(q1Var);
    }

    public final void v(q1 q1Var) {
        x(q1Var);
        d(q1Var);
    }

    public void y() {
    }

    public void w(q1 q1Var) {
    }

    public void x(q1 q1Var) {
    }
}
