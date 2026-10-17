package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class iv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sv0 b;

    public /* synthetic */ iv0(sv0 sv0Var, int i10) {
        this.a = i10;
        this.b = sv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sv0 sv0Var = this.b;
                AndroidUtilities.runOnUIThread(new iv0(sv0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = sv0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = sv0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                pm pmVar = sv0Var.e0;
                if (pmVar != null) {
                    AndroidUtilities.runOnUIThread(pmVar);
                    sv0Var.e0 = null;
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

    public /* synthetic */ iv0(sv0 sv0Var, boolean z10) {
        this.a = 0;
        this.b = sv0Var;
    }
}
