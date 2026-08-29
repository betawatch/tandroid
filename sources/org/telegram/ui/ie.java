package org.telegram.ui;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ie implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ org.telegram.ui.Components.yl0 b;

    public /* synthetic */ ie(org.telegram.ui.Components.yl0 yl0Var, int i10) {
        this.a = i10;
        this.b = yl0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                org.telegram.ui.Components.yl0 yl0Var = this.b;
                if (!yl0Var.I) {
                    yl0Var.I = true;
                    yl0Var.c(new org.telegram.ui.Components.wl0(yl0Var, 0), false);
                    yl0Var.s.invalidate();
                    break;
                }
                break;
            default:
                this.b.dismiss();
                break;
        }
    }
}
