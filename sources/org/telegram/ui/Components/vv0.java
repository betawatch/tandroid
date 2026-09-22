package org.telegram.ui.Components;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class vv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ vv0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                xv0Var.V0 = false;
                if (!xv0Var.Y0 && xv0Var.W0) {
                    xv0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                xv0 xv0Var2 = this.b;
                xv0Var2.Y0 = false;
                if (!xv0Var2.V0 && xv0Var2.W0) {
                    xv0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
