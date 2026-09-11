package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final /* synthetic */ class aw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lw0 b;

    public /* synthetic */ aw0(lw0 lw0Var, int i10) {
        this.a = i10;
        this.b = lw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lw0 lw0Var = this.b;
                AndroidUtilities.runOnUIThread(new aw0(lw0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = lw0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = lw0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                zm zmVar = lw0Var.e0;
                if (zmVar != null) {
                    AndroidUtilities.runOnUIThread(zmVar);
                    lw0Var.e0 = null;
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

    public /* synthetic */ aw0(lw0 lw0Var, boolean z10) {
        this.a = 0;
        this.b = lw0Var;
    }
}
