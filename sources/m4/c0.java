package m4;

import v7.o8;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes.dex */
public final /* synthetic */ class c0 implements k0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l0 b;

    public /* synthetic */ c0(l0 l0Var, int i10) {
        this.a = i10;
        this.b = l0Var;
    }

    @Override // m4.k0
    public final void h(r rVar) {
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
                    o8.b(new r1(-6));
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
                l1 l1Var = b0Var2.t;
                if (!e2.d0.a0(l1Var, b0Var2.p)) {
                    if (l1Var != null && l1Var.m0(1)) {
                        l1Var.e();
                        break;
                    }
                } else {
                    e2.d0.H(l1Var);
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
                l1 l1Var2 = l0Var.g.t;
                String str = e2.d0.a;
                if (l1Var2 != null && l1Var2.m0(1)) {
                    l1Var2.e();
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
