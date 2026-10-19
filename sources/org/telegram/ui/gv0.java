package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qv0 b;

    public /* synthetic */ gv0(qv0 qv0Var, int i10) {
        this.a = i10;
        this.b = qv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qv0 qv0Var = this.b;
                AndroidUtilities.runOnUIThread(new gv0(qv0Var, 3));
                org.telegram.ui.Cells.u1 u1Var = qv0Var.L;
                if (u1Var != null) {
                    u1Var.setVisibility(0);
                    org.telegram.ui.Cells.u1 u1Var2 = qv0Var.L;
                    u1Var2.L7 = null;
                    u1Var2.invalidate();
                }
                nm nmVar = qv0Var.e0;
                if (nmVar != null) {
                    AndroidUtilities.runOnUIThread(nmVar);
                    qv0Var.e0 = null;
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

    public /* synthetic */ gv0(qv0 qv0Var, boolean z10) {
        this.a = 0;
        this.b = qv0Var;
    }
}
