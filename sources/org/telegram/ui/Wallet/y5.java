package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class y5 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a6 b;

    public /* synthetic */ y5(a6 a6Var, int i3) {
        this.a = i3;
        this.b = a6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.performClick();
                break;
            default:
                a6 a6Var = this.b;
                a6Var.h.invalidate();
                a6Var.n.invalidate();
                a6Var.e.invalidate();
                break;
        }
    }
}
