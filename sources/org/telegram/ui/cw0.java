package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final /* synthetic */ class cw0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ow0 b;

    public /* synthetic */ cw0(ow0 ow0Var, int i10) {
        this.a = i10;
        this.b = ow0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ow0 ow0Var = this.b;
                AndroidUtilities.runOnUIThread(new cw0(ow0Var, 3));
                org.telegram.ui.Cells.t1 t1Var = ow0Var.L;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = ow0Var.L;
                    t1Var2.L7 = null;
                    t1Var2.invalidate();
                }
                an anVar = ow0Var.e0;
                if (anVar != null) {
                    AndroidUtilities.runOnUIThread(anVar);
                    ow0Var.e0 = null;
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

    public /* synthetic */ cw0(ow0 ow0Var, boolean z10) {
        this.a = 0;
        this.b = ow0Var;
    }
}
