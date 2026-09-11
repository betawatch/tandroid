package m4;

import v7.l8;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes.dex */
public final /* synthetic */ class b0 implements j0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ k0 b;

    public /* synthetic */ b0(k0 k0Var, int i10) {
        this.a = i10;
        this.b = k0Var;
    }

    @Override // m4.j0
    public final void f(r rVar) {
        int i10 = this.a;
        k0 k0Var = this.b;
        switch (i10) {
            case 0:
                k0Var.g.t.F0();
                break;
            case 1:
                a0 a0Var = k0Var.g;
                if (a0Var.t.P0() != null) {
                    ob.a aVar = a0Var.e;
                    a0Var.s(rVar);
                    aVar.getClass();
                    l8.b(new p1(-6));
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
                j1 j1Var = a0Var2.t;
                if (!e2.d0.a0(j1Var, a0Var2.p)) {
                    if (j1Var != null && j1Var.m0(1)) {
                        j1Var.e();
                        break;
                    }
                } else {
                    e2.d0.H(j1Var);
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
                j1 j1Var2 = k0Var.g.t;
                String str = e2.d0.a;
                if (j1Var2 != null && j1Var2.m0(1)) {
                    j1Var2.e();
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
