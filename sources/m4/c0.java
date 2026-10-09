package m4;

import v7.j8;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ c0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // m4.k0
    public final void g(r rVar) {
        int i10 = this.a;
        l0 l0Var = this.b;
        switch (i10) {
            case 0:
                l0Var.g.t.F0();
                break;
            case 1:
                b0 b0Var = l0Var.g;
                if (b0Var.t.P0() != null) {
                    na.d dVar = b0Var.e;
                    b0Var.s(rVar);
                    dVar.getClass();
                    j8.b(new l1(-6));
                    break;
                }
                break;
            case 2:
                l0Var.g.t.V();
                break;
            case 3:
                l0Var.g.t.F();
                break;
            case 4:
                l0Var.g.t.G0();
                break;
            case 5:
                l0Var.g.t.b();
                break;
            case 6:
                l0Var.g.t.stop();
                break;
            case 7:
                b0 b0Var2 = l0Var.g;
                f1 f1Var = b0Var2.t;
                if (!e2.d0.Z(f1Var, b0Var2.p)) {
                    if (f1Var != null && f1Var.m0(1)) {
                        f1Var.e();
                        break;
                    }
                } else {
                    e2.d0.G(f1Var);
                    break;
                }
                break;
            case 8:
                l0Var.g.t.E0();
                break;
            case 9:
                l0Var.g.t.e0();
                break;
            case 10:
                l0Var.g.g(rVar, true);
                break;
            default:
                f1 f1Var2 = l0Var.g.t;
                String str = e2.d0.a;
                if (f1Var2 != null && f1Var2.m0(1)) {
                    f1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ c0(l0 l0Var, b2.c1 c1Var) {
        this.a = 1;
        this.b = l0Var;
    }
}
