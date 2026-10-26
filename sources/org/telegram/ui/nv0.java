package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nv0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xv0 b;

    public /* synthetic */ nv0(xv0 xv0Var, int i10) {
        this.a = i10;
        this.b = xv0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xv0 xv0Var = this.b;
                AndroidUtilities.runOnUIThread(new nv0(xv0Var, 3));
                org.telegram.ui.Cells.s1 s1Var = xv0Var.L;
                if (s1Var != null) {
                    s1Var.setVisibility(0);
                    org.telegram.ui.Cells.s1 s1Var2 = xv0Var.L;
                    s1Var2.L7 = null;
                    s1Var2.invalidate();
                }
                qm qmVar = xv0Var.e0;
                if (qmVar != null) {
                    AndroidUtilities.runOnUIThread(qmVar);
                    xv0Var.e0 = null;
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

    public /* synthetic */ nv0(xv0 xv0Var, boolean z10) {
        this.a = 0;
        this.b = xv0Var;
    }
}
