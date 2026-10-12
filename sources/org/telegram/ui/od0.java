package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.AlertDialog$Builder;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class od0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bh0 b;

    public /* synthetic */ od0(bh0 bh0Var, int i10) {
        this.a = i10;
        this.b = bh0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                this.b.c0 = false;
                break;
            case 1:
                bh0 bh0Var = this.b;
                bh0Var.r0 = false;
                bh0Var.x1(true, true);
                break;
            default:
                bh0 bh0Var2 = this.b;
                if (bh0Var2.getParentActivity() != null && !bh0Var2.getParentActivity().isFinishing() && bh0Var2.getParentActivity() != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(bh0Var2.getParentActivity());
                    alertDialog$Builder.a.R = LocaleController.getString(R.string.RestorePasswordNoEmailTitle);
                    alertDialog$Builder.a.T = LocaleController.getString(R.string.SafetyNetErrorOccurred);
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ud0(bh0Var2, 1));
                    alertDialog$Builder.o();
                    break;
                }
                break;
        }
    }
}
