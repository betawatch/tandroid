package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.nk0 b;

    public /* synthetic */ ee(org.telegram.ui.Components.nk0 nk0Var, int i3) {
        this.a = i3;
        this.b = nk0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.nk0 nk0Var = this.b;
                if (!nk0Var.N) {
                    nk0Var.N = true;
                    nk0Var.c(new org.telegram.ui.Components.lk0(nk0Var, 0), false);
                    nk0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
