package org.telegram.ui;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class cb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yb0 b;

    public /* synthetic */ cb0(yb0 yb0Var, int i10) {
        this.a = i10;
        this.b = yb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yb0.d0(this.b);
                break;
            case 1:
                yb0 yb0Var = this.b;
                yb0Var.getLocationController().o(0, yb0Var.n0, true);
                yb0Var.E = false;
                break;
            case 2:
                yb0 yb0Var2 = this.b;
                org.telegram.messenger.ua uaVar = yb0Var2.H;
                if (uaVar != null) {
                    yb0Var2.G.i(uaVar);
                    yb0Var2.H = null;
                    break;
                }
                break;
            case 3:
                yb0.b0(this.b);
                break;
            case 4:
                yb0 yb0Var3 = this.b;
                org.telegram.messenger.ga gaVar = yb0Var3.G;
                if (gaVar != null) {
                    gaVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), yb0Var3.u0());
                }
                if (!yb0Var3.P.getRadiusSet()) {
                    double d = yb0Var3.N;
                    if (d > 0.0d) {
                        yb0Var3.M.H0(d);
                    } else {
                        m4.c cVar = yb0Var3.M;
                        if (cVar != null) {
                            cVar.v0();
                            yb0Var3.M = null;
                        }
                    }
                }
                yb0Var3.P = null;
                break;
            case 5:
                this.b.E0();
                break;
            case 6:
                yb0 yb0Var4 = this.b;
                ub0 ub0Var = yb0Var4.w;
                if (ub0Var != null) {
                    ub0Var.a();
                }
                yb0Var4.E0();
                break;
            default:
                org.telegram.messenger.i0.g3(new cb0(this.b, 2));
                break;
        }
    }
}
