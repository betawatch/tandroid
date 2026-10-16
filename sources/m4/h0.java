package m4;

import android.os.Bundle;
import v7.q8;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements o0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ p0 b;

    public /* synthetic */ h0(p0 p0Var, int i10) {
        this.a = i10;
        this.b = p0Var;
    }

    @Override // m4.o0
    public final void e(v vVar) {
        int i10 = this.a;
        p0 p0Var = this.b;
        switch (i10) {
            case 0:
                p0Var.g.n(vVar);
                break;
            case 1:
                e0 e0Var = p0Var.g;
                if (e0Var.t.S0() != null) {
                    pb.a aVar = e0Var.e;
                    e0Var.s(vVar);
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
                e0 e0Var2 = p0Var.g;
                m1 m1Var = e0Var2.t;
                if (!e2.m0.c0(m1Var, e0Var2.p)) {
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

    public /* synthetic */ h0(p0 p0Var, b2.h1 h1Var) {
        this.a = 1;
        this.b = p0Var;
    }

    public /* synthetic */ h0(p0 p0Var, o1 o1Var, Bundle bundle) {
        this.a = 0;
        this.b = p0Var;
    }
}
