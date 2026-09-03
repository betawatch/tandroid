package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ yv0 b;

    public /* synthetic */ nv0(yv0 yv0Var, int i10) {
        this.a = i10;
        this.b = yv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                yv0 yv0Var = this.b;
                AndroidUtilities.runOnUIThread(new nv0(yv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = yv0Var.I;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = yv0Var.I;
                    s1Var2.I7 = null;
                    s1Var2.invalidate();
                }
                wm wmVar = yv0Var.b0;
                if (wmVar != null) {
                    AndroidUtilities.runOnUIThread(wmVar);
                    yv0Var.b0 = null;
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

    public /* synthetic */ nv0(yv0 yv0Var, boolean z4) {
        this.a = 0;
        this.b = yv0Var;
    }
}
