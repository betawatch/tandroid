package org.telegram.ui;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pe implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.am0 b;

    public /* synthetic */ pe(org.telegram.ui.Components.am0 am0Var, int i10) {
        this.a = i10;
        this.b = am0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.am0 am0Var = this.b;
                if (!am0Var.M) {
                    am0Var.M = true;
                    am0Var.c(new org.telegram.ui.Components.yl0(am0Var, 0), false);
                    am0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
