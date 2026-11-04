package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class wt0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yt0 b;

    public /* synthetic */ wt0(yt0 yt0Var, int i3) {
        this.a = i3;
        this.b = yt0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yt0 yt0Var = this.b;
                yt0Var.W0 = false;
                if (!yt0Var.Z0 && yt0Var.X0) {
                    yt0Var.C(true);
                    break;
                }
                break;
            case 1:
                this.b.W0 = false;
                break;
            case 2:
                yt0 yt0Var2 = this.b;
                yt0Var2.Z0 = false;
                if (!yt0Var2.W0 && yt0Var2.X0) {
                    yt0Var2.C(true);
                    break;
                }
                break;
            default:
                this.b.Z0 = false;
                break;
        }
    }
}
