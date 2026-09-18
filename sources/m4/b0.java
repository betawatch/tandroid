package m4;

import v7.l8;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ b0(l0 l0Var, int i10) {
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
                a0 a0Var = l0Var.g;
                if (a0Var.t.P0() != null) {
                    na.d dVar = a0Var.e;
                    a0Var.s(rVar);
                    dVar.getClass();
                    l8.b(new q1(-6));
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
                a0 a0Var2 = l0Var.g;
                k1 k1Var = a0Var2.t;
                if (!e2.d0.a0(k1Var, a0Var2.p)) {
                    if (k1Var != null && k1Var.m0(1)) {
                        k1Var.e();
                        break;
                    }
                } else {
                    e2.d0.H(k1Var);
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
                k1 k1Var2 = l0Var.g.t;
                String str = e2.d0.a;
                if (k1Var2 != null && k1Var2.m0(1)) {
                    k1Var2.e();
                    break;
                }
                break;
        }
    }

    public /* synthetic */ b0(l0 l0Var, b2.c1 c1Var) {
        this.a = 1;
        this.b = l0Var;
    }
}
