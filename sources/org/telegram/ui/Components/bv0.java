package org.telegram.ui.Components;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dv0 b;

    public /* synthetic */ bv0(dv0 dv0Var, int i10) {
        this.a = i10;
        this.b = dv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dv0 dv0Var = this.b;
                dv0Var.V0 = false;
                if (!dv0Var.Y0 && dv0Var.W0) {
                    dv0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                dv0 dv0Var2 = this.b;
                dv0Var2.Y0 = false;
                if (!dv0Var2.V0 && dv0Var2.W0) {
                    dv0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
