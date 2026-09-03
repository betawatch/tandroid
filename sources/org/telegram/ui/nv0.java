package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
                org.telegram.ui.Cells.t1 t1Var = yv0Var.I;
                if (t1Var != null) {
                    t1Var.setVisibility(0);
                    org.telegram.ui.Cells.t1 t1Var2 = yv0Var.I;
                    t1Var2.I7 = null;
                    t1Var2.invalidate();
                }
                um umVar = yv0Var.b0;
                if (umVar != null) {
                    AndroidUtilities.runOnUIThread(umVar);
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
