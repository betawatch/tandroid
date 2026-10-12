package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class hw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sw0 b;

    public /* synthetic */ hw0(sw0 sw0Var, int i10) {
        this.a = i10;
        this.b = sw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sw0 sw0Var = this.b;
                AndroidUtilities.runOnUIThread(new hw0(sw0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = sw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = sw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                bn bnVar = sw0Var.e0;
                if (bnVar != null) {
                    AndroidUtilities.runOnUIThread(bnVar);
                    sw0Var.e0 = null;
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

    public /* synthetic */ hw0(sw0 sw0Var, boolean z10) {
        this.a = 0;
        this.b = sw0Var;
    }
}
