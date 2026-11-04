package org.telegram.ui;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gr0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pr0 b;

    public /* synthetic */ gr0(pr0 pr0Var, int i3) {
        this.a = i3;
        this.b = pr0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pr0 pr0Var = this.b;
                org.telegram.messenger.g0.h3(new gr0(pr0Var, 3));
                org.telegram.ui.Cells.q1 q1Var = pr0Var.M;
                if (q1Var != null) {
                    q1Var.setVisibility(0);
                    org.telegram.ui.Cells.q1 q1Var2 = pr0Var.M;
                    q1Var2.c6 = null;
                    q1Var2.invalidate();
                }
                pl plVar = pr0Var.f0;
                if (plVar != null) {
                    org.telegram.messenger.g0.h3(plVar);
                    pr0Var.f0 = null;
                    break;
                }
                break;
            case 1:
                this.b.c(false);
                break;
            case 2:
                this.b.c(false);
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }

    public /* synthetic */ gr0(pr0 pr0Var, boolean z10) {
        this.a = 0;
        this.b = pr0Var;
    }
}
