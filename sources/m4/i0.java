package m4;

import android.os.Bundle;
import v7.q8;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes.dex */
public final /* synthetic */ class i0 implements o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ i0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // m4.o0
    public final void f(v vVar) {
        int i10 = this.a;
        p0 p0Var = this.b;
        switch (i10) {
            case 0:
                p0Var.g.n(vVar);
                break;
            case 1:
                f0 f0Var = p0Var.g;
                if (f0Var.t.S0() != null) {
                    pb.a aVar = f0Var.e;
                    f0Var.s(vVar);
                    aVar.getClass();
                    q8.b(new s1(-6));
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
                p0Var.g.g(vVar, true);
                break;
            case 7:
                p0Var.g.t.b();
                break;
            case 8:
                p0Var.g.t.stop();
                break;
            case 9:
                f0 f0Var2 = p0Var.g;
                m1 m1Var = f0Var2.t;
                if (!e2.m0.c0(m1Var, f0Var2.p)) {
                    if (m1Var != null && m1Var.o0(1)) {
                        m1Var.e();
                        break;
                    }
                } else {
                    e2.m0.J(m1Var);
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
                m1 m1Var2 = p0Var.g.t;
                String str = e2.m0.a;
                if (m1Var2 != null && m1Var2.o0(1)) {
                    m1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ i0(p0 p0Var, b2.g1 g1Var) {
        this.a = 1;
        this.b = p0Var;
    }

    public /* synthetic */ i0(p0 p0Var, o1 o1Var, Bundle bundle) {
        this.a = 0;
        this.b = p0Var;
    }
}
