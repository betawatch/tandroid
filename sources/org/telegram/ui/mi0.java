package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class mi0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hj0 b;

    public /* synthetic */ mi0(hj0 hj0Var, int i10) {
        this.a = i10;
        this.b = hj0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                super/*android.app.Dialog*/.dismiss();
                break;
            case 1:
                hj0 hj0Var = this.b;
                hj0Var.getClass();
                wh.f.f(false);
                wh.f fVar = hj0Var.i0;
                if (fVar != null) {
                    fVar.b(hj0Var.F);
                }
                AndroidUtilities.runOnUIThread(new mi0(hj0Var, 0));
                break;
            case 2:
                wh.f.f(false);
                hj0 hj0Var2 = this.b;
                wh.f fVar2 = hj0Var2.i0;
                if (fVar2 != null) {
                    fVar2.b(hj0Var2.F);
                }
                AndroidUtilities.runOnUIThread(new mi0(hj0Var2, 3));
                break;
            default:
                super/*android.app.Dialog*/.dismiss();
                break;
        }
    }
}
