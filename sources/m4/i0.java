package m4;

import android.os.Bundle;
import v7.p8;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ i0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // m4.o0
    public final void b(w wVar) {
        int i10 = this.a;
        p0 p0Var = this.b;
        switch (i10) {
            case 0:
                p0Var.h.n(wVar);
                break;
            case 1:
                f0 f0Var = p0Var.h;
                if (f0Var.t.S0() != null) {
                    oa.d dVar = f0Var.e;
                    f0Var.s(wVar);
                    dVar.getClass();
                    p8.b(new t1(-6));
                    break;
                }
                break;
            case 2:
                p0Var.h.t.T();
                break;
            case 3:
                p0Var.h.t.E();
                break;
            case 4:
                p0Var.h.t.I0();
                break;
            case 5:
                p0Var.h.t.J0();
                break;
            case 6:
                p0Var.h.g(wVar, true);
                break;
            case 7:
                p0Var.h.t.a();
                break;
            case 8:
                p0Var.h.t.stop();
                break;
            case 9:
                f0 f0Var2 = p0Var.h;
                n1 n1Var = f0Var2.t;
                if (!e2.l0.c0(n1Var, f0Var2.p)) {
                    if (n1Var != null && n1Var.n0(1)) {
                        n1Var.e();
                        break;
                    }
                } else {
                    e2.l0.J(n1Var);
                    break;
                }
                break;
            case 10:
                p0Var.h.t.H0();
                break;
            case 11:
                p0Var.h.t.e0();
                break;
            default:
                n1 n1Var2 = p0Var.h.t;
                String str = e2.l0.a;
                if (n1Var2 != null && n1Var2.n0(1)) {
                    n1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i0(p0 p0Var, b2.g1 g1Var) {
        this.a = 1;
        this.b = p0Var;
    }

    public /* synthetic */ i0(p0 p0Var, p1 p1Var, Bundle bundle) {
        this.a = 0;
        this.b = p0Var;
    }
}
