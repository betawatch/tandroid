package org.telegram.ui.Components;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rw0 b;

    public /* synthetic */ pw0(rw0 rw0Var, int i10) {
        this.a = i10;
        this.b = rw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rw0 rw0Var = this.b;
                rw0Var.V0 = false;
                if (!rw0Var.Y0 && rw0Var.W0) {
                    rw0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                rw0 rw0Var2 = this.b;
                rw0Var2.Y0 = false;
                if (!rw0Var2.V0 && rw0Var2.W0) {
                    rw0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
