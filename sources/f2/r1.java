package f2;

import java.util.ArrayList;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes.dex */
public abstract class r1 extends v0 {
    public boolean m;
    public boolean n;

    public r1() {
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

    @Override // f2.v0
    public boolean a(o1 o1Var, d5.p pVar, d5.p pVar2) {
        int i10;
        int i11;
        if (pVar != null && ((i10 = pVar.a) != (i11 = pVar2.a) || pVar.b != pVar2.b || this.n)) {
            return r(o1Var, pVar, i10, pVar.b, i11, pVar2.b);
        }
        p(o1Var);
        return true;
    }

    public abstract void p(o1 o1Var);

    public abstract boolean q(o1 o1Var, o1 o1Var2, d5.p pVar, int i10, int i11, int i12, int i13);

    public abstract boolean r(o1 o1Var, d5.p pVar, int i10, int i11, int i12, int i13);

    public abstract void s(o1 o1Var, d5.p pVar);

    public boolean t(o1 o1Var) {
        return !this.m || o1Var.h();
    }

    public final void u(o1 o1Var) {
        w(o1Var);
        d(o1Var);
    }

    public final void v(o1 o1Var) {
        x(o1Var);
        d(o1Var);
    }

    public void y() {
    }

    public void w(o1 o1Var) {
    }

    public void x(o1 o1Var) {
    }
}
