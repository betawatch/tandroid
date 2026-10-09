package org.telegram.ui.Components;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final /* synthetic */ class yw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ax0 b;

    public /* synthetic */ yw0(ax0 ax0Var, int i10) {
        this.a = i10;
        this.b = ax0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ax0 ax0Var = this.b;
                ax0Var.V0 = false;
                if (!ax0Var.Y0 && ax0Var.W0) {
                    ax0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.V0 = false;
                break;
            case 2:
                ax0 ax0Var2 = this.b;
                ax0Var2.Y0 = false;
                if (!ax0Var2.V0 && ax0Var2.W0) {
                    ax0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Y0 = false;
                break;
        }
    }
}
