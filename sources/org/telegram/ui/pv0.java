package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zv0 b;

    public /* synthetic */ pv0(zv0 zv0Var, int i10) {
        this.a = i10;
        this.b = zv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zv0 zv0Var = this.b;
                AndroidUtilities.runOnUIThread(new pv0(zv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = zv0Var.L;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = zv0Var.L;
                    s1Var2.L7 = null;
                    s1Var2.invalidate();
                }
                sm smVar = zv0Var.e0;
                if (smVar != null) {
                    AndroidUtilities.runOnUIThread(smVar);
                    zv0Var.e0 = null;
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

    public /* synthetic */ pv0(zv0 zv0Var, boolean z10) {
        this.a = 0;
        this.b = zv0Var;
    }
}
