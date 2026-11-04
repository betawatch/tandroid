package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ek0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;

    public /* synthetic */ ek0(dl0 dl0Var, int i3) {
        this.a = i3;
        this.b = dl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.z0();
                break;
            case 1:
                dl0 dl0Var = this.b;
                dl0Var.getMessagesController().l7 = null;
                if (dl0Var.g1 == 3 && !dl0Var.isFinishing()) {
                    dl0Var.g1 = 4;
                    cl0 cl0Var = dl0Var.a1;
                    if (cl0Var != null) {
                        cl0Var.e(4);
                    }
                    dl0Var.finishFragment();
                    break;
                } else if (dl0Var.g1 == 1 && !dl0Var.isFinishing()) {
                    dl0Var.finishFragment();
                    break;
                }
                break;
            case 2:
                dl0 dl0Var2 = this.b;
                if (dl0Var2.e0 != null) {
                    dl0Var2.C0();
                    dl0Var2.e0 = null;
                    break;
                }
                break;
            default:
                dl0 dl0Var3 = this.b;
                dl0Var3.f[0].requestFocus();
                org.telegram.messenger.g0.K3(dl0Var3.f[0]);
                break;
        }
    }
}
