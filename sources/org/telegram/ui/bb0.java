package org.telegram.ui;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ bb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb0.e0(this.b);
                break;
            case 1:
                xb0 xb0Var = this.b;
                xb0Var.getLocationController().o(0, xb0Var.n0, true);
                xb0Var.E = false;
                break;
            case 2:
                xb0 xb0Var2 = this.b;
                org.telegram.messenger.va vaVar = xb0Var2.H;
                if (vaVar != null) {
                    xb0Var2.G.i(vaVar);
                    xb0Var2.H = null;
                    break;
                }
                break;
            case 3:
                xb0.c0(this.b);
                break;
            case 4:
                xb0 xb0Var3 = this.b;
                org.telegram.messenger.ha haVar = xb0Var3.G;
                if (haVar != null) {
                    haVar.q(org.telegram.messenger.i0.L(70.0f), 0, org.telegram.messenger.i0.L(70.0f), xb0Var3.v0());
                }
                if (!xb0Var3.P.getRadiusSet()) {
                    double d = xb0Var3.N;
                    if (d > 0.0d) {
                        xb0Var3.M.H0(d);
                    } else {
                        m4.c cVar = xb0Var3.M;
                        if (cVar != null) {
                            cVar.v0();
                            xb0Var3.M = null;
                        }
                    }
                }
                xb0Var3.P = null;
                break;
            case 5:
                this.b.F0();
                break;
            case 6:
                xb0 xb0Var4 = this.b;
                tb0 tb0Var = xb0Var4.w;
                if (tb0Var != null) {
                    tb0Var.a();
                }
                xb0Var4.F0();
                break;
            default:
                org.telegram.messenger.i0.g3(new bb0(this.b, 2));
                break;
        }
    }
}
