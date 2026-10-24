package org.telegram.ui.Components;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final /* synthetic */ class uw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ww0 b;

    public /* synthetic */ uw0(ww0 ww0Var, int i10) {
        this.a = i10;
        this.b = ww0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ww0 ww0Var = this.b;
                ww0Var.V0 = false;
                if (!ww0Var.Y0 && ww0Var.W0) {
                    ww0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                ww0 ww0Var2 = this.b;
                ww0Var2.Y0 = false;
                if (!ww0Var2.V0 && ww0Var2.W0) {
                    ww0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
