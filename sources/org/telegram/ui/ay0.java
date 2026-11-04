package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ay0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dy0 b;

    public /* synthetic */ ay0(dy0 dy0Var, int i3) {
        this.a = i3;
        this.b = dy0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                dy0 dy0Var = this.b;
                ey0 ey0Var = dy0Var.w;
                if (dy0Var.a != 0) {
                    ey0Var.onBackPressed();
                    break;
                } else {
                    ey0Var.dismiss();
                    break;
                }
            default:
                org.telegram.messenger.g0.K3(this.b.n.d);
                break;
        }
    }
}
