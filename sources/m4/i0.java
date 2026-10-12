package m4;

import android.os.Bundle;
import v7.q8;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements p0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ q0 b;

    public /* synthetic */ i0(q0 q0Var, int i10) {
        this.a = i10;
        this.b = q0Var;
    }

    @Override // m4.p0
    public final void f(w wVar) {
        int i10 = this.a;
        q0 q0Var = this.b;
        switch (i10) {
            case 0:
                q0Var.g.n(wVar);
                break;
            case 1:
                f0 f0Var = q0Var.g;
                if (f0Var.t.S0() != null) {
                    pb.a aVar = f0Var.e;
                    f0Var.s(wVar);
                    aVar.getClass();
                    q8.b(new t1(-6));
                    break;
                }
                break;
            case 2:
                q0Var.g.t.V();
                break;
            case 3:
                q0Var.g.t.E();
                break;
            case 4:
                q0Var.g.t.I0();
                break;
            case 5:
                q0Var.g.t.J0();
                break;
            case 6:
                q0Var.g.g(wVar, true);
                break;
            case 7:
                q0Var.g.t.b();
                break;
            case 8:
                q0Var.g.t.stop();
                break;
            case 9:
                f0 f0Var2 = q0Var.g;
                n1 n1Var = f0Var2.t;
                if (!e2.m0.c0(n1Var, f0Var2.p)) {
                    if (n1Var != null && n1Var.o0(1)) {
                        n1Var.e();
                        break;
                    }
                } else {
                    e2.m0.J(n1Var);
                    break;
                }
                break;
            case 10:
                q0Var.g.t.H0();
                break;
            case 11:
                q0Var.g.t.f0();
                break;
            default:
                n1 n1Var2 = q0Var.g.t;
                String str = e2.m0.a;
                if (n1Var2 != null && n1Var2.o0(1)) {
                    n1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i0(q0 q0Var, b2.h1 h1Var) {
        this.a = 1;
        this.b = q0Var;
    }

    public /* synthetic */ i0(q0 q0Var, p1 p1Var, Bundle bundle) {
        this.a = 0;
        this.b = q0Var;
    }
}
