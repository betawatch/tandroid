package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mw0 b;

    public /* synthetic */ bw0(mw0 mw0Var, int i10) {
        this.a = i10;
        this.b = mw0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mw0 mw0Var = this.b;
                AndroidUtilities.runOnUIThread(new bw0(mw0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = mw0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = mw0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                ym ymVar = mw0Var.e0;
                if (ymVar != null) {
                    AndroidUtilities.runOnUIThread(ymVar);
                    mw0Var.e0 = null;
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

    public /* synthetic */ bw0(mw0 mw0Var, boolean z10) {
        this.a = 0;
        this.b = mw0Var;
    }
}
