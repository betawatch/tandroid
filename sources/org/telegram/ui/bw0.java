package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
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
                org.telegram.ui.Cells.u1 u1Var = mw0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = mw0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                wm wmVar = mw0Var.e0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
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
