package org.telegram.ui;

/* compiled from: r8-map-id-914a42c19c49658e9d638b32d61254875ad778270fd8b91a9fbd9dcaec68ff21 */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qa0 b;

    public /* synthetic */ aa0(qa0 qa0Var, int i7) {
        this.a = i7;
        this.b = qa0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qa0.b0(this.b);
                break;
            case 1:
                qa0 qa0Var = this.b;
                org.telegram.messenger.sa saVar = qa0Var.G;
                if (saVar != null) {
                    qa0Var.F.h(saVar);
                    qa0Var.G = null;
                    break;
                }
                break;
            case 2:
                qa0.a0(this.b);
                break;
            case 3:
                qa0 qa0Var2 = this.b;
                qa0Var2.getLocationController().o(0, qa0Var2.m0, true);
                qa0Var2.y = false;
                break;
            case 4:
                qa0 qa0Var3 = this.b;
                org.telegram.messenger.da daVar = qa0Var3.F;
                if (daVar != null) {
                    daVar.n(org.telegram.messenger.g0.L(70.0f), 0, org.telegram.messenger.g0.L(70.0f), qa0Var3.t0());
                }
                if (!qa0Var3.O.getRadiusSet()) {
                    double d = qa0Var3.M;
                    if (d > 0.0d) {
                        qa0Var3.L.e1(d);
                    } else {
                        k8.a aVar = qa0Var3.L;
                        if (aVar != null) {
                            aVar.b1();
                            qa0Var3.L = null;
                        }
                    }
                }
                qa0Var3.O = null;
                break;
            case 5:
                this.b.D0();
                break;
            case 6:
                this.b.D0();
                break;
            default:
                org.telegram.messenger.g0.g3(new aa0(this.b, 1));
                break;
        }
    }
}
