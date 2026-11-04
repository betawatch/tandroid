package org.telegram.ui.Wallet;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class r6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ u6 b;

    public /* synthetic */ r6(u6 u6Var, int i3) {
        this.a = i3;
        this.b = u6Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                u6.a(this.b);
                break;
            default:
                u6 u6Var = this.b;
                Runnable runnable = u6Var.d0;
                u6Var.d0 = null;
                if (runnable != null) {
                    runnable.run();
                    break;
                }
                break;
        }
    }
}
