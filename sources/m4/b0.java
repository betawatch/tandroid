package m4;

import v7.m8;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ b0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // m4.j0
    public final void g(r rVar) {
        int i10 = this.a;
        k0 k0Var = this.b;
        switch (i10) {
            case 0:
                k0Var.g.t.F0();
                break;
            case 1:
                a0 a0Var = k0Var.g;
                if (a0Var.t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    m8.b(new k1(-6));
                    break;
                }
                break;
            case 2:
                k0Var.g.t.V();
                break;
            case 3:
                k0Var.g.t.F();
                break;
            case 4:
                k0Var.g.t.G0();
                break;
            case 5:
                k0Var.g.t.b();
                break;
            case 6:
                k0Var.g.t.stop();
                break;
            case 7:
                a0 a0Var2 = k0Var.g;
                e1 e1Var = a0Var2.t;
                if (!e2.d0.a0(e1Var, a0Var2.p)) {
                    if (e1Var != null && e1Var.m0(1)) {
                        e1Var.e();
                        break;
                    }
                } else {
                    e2.d0.H(e1Var);
                    break;
                }
                break;
            case 8:
                k0Var.g.t.E0();
                break;
            case 9:
                k0Var.g.t.e0();
                break;
            case 10:
                k0Var.g.g(rVar, true);
                break;
            default:
                e1 e1Var2 = k0Var.g.t;
                String str = e2.d0.a;
                if (e1Var2 != null && e1Var2.m0(1)) {
                    e1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(k0 k0Var, b2.c1 c1Var) {
        this.a = 1;
        this.b = k0Var;
    }
}
