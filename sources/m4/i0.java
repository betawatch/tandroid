package m4;

import a8.qd;
import android.os.Bundle;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ i0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // m4.o0
    public final void i(w wVar) {
        int i10 = this.a;
        p0 p0Var = this.b;
        switch (i10) {
            case 0:
                p0Var.g.n(wVar);
                break;
            case 1:
                f0 f0Var = p0Var.g;
                if (f0Var.t.S0() != null) {
                    qb.a aVar = f0Var.e;
                    f0Var.s(wVar);
                    aVar.getClass();
                    qd.b(new t1(-6));
                    break;
                }
                break;
            case 2:
                p0Var.g.t.V();
                break;
            case 3:
                p0Var.g.t.E();
                break;
            case 4:
                p0Var.g.t.I0();
                break;
            case 5:
                p0Var.g.t.J0();
                break;
            case 6:
                p0Var.g.g(wVar, true);
                break;
            case 7:
                p0Var.g.t.a();
                break;
            case 8:
                p0Var.g.t.stop();
                break;
            case 9:
                f0 f0Var2 = p0Var.g;
                n1 n1Var = f0Var2.t;
                if (!e2.n0.c0(n1Var, f0Var2.p)) {
                    if (n1Var != null && n1Var.o0(1)) {
                        n1Var.e();
                        break;
                    }
                } else {
                    e2.n0.J(n1Var);
                    break;
                }
                break;
            case 10:
                p0Var.g.t.H0();
                break;
            case 11:
                p0Var.g.t.f0();
                break;
            default:
                n1 n1Var2 = p0Var.g.t;
                String str = e2.n0.a;
                if (n1Var2 != null && n1Var2.o0(1)) {
                    n1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i0(p0 p0Var, b2.h1 h1Var) {
        this.a = 1;
        this.b = p0Var;
    }

    public /* synthetic */ i0(p0 p0Var, p1 p1Var, Bundle bundle) {
        this.a = 0;
        this.b = p0Var;
    }
}
