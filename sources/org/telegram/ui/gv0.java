package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rv0 b;

    public /* synthetic */ gv0(rv0 rv0Var, int i10) {
        this.a = i10;
        this.b = rv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rv0 rv0Var = this.b;
                AndroidUtilities.runOnUIThread(new gv0(rv0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = rv0Var.I;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = rv0Var.I;
                    t1Var2.I7 = null;
                    t1Var2.invalidate();
                }
                um umVar = rv0Var.b0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
                    rv0Var.b0 = null;
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

    public /* synthetic */ gv0(rv0 rv0Var, boolean z4) {
        this.a = 0;
        this.b = rv0Var;
    }
}
