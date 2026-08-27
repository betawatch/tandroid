package org.telegram.ui.Components;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class fv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hv0 b;

    public /* synthetic */ fv0(hv0 hv0Var, int i10) {
        this.a = i10;
        this.b = hv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hv0 hv0Var = this.b;
                hv0Var.R0 = false;
                if (!hv0Var.U0 && hv0Var.S0) {
                    hv0Var.A(true);
                    break;
                }
                break;
            case 1:
                this.b.R0 = false;
                break;
            case 2:
                hv0 hv0Var2 = this.b;
                hv0Var2.U0 = false;
                if (!hv0Var2.R0 && hv0Var2.S0) {
                    hv0Var2.A(true);
                    break;
                }
                break;
            default:
                this.b.U0 = false;
                break;
        }
    }
}
