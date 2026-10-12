package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class pb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ac0 b;

    public /* synthetic */ pb0(ac0 ac0Var, int i10) {
        this.a = i10;
        this.b = ac0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ac0 ac0Var = this.b;
                ac0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(ac0Var.r.b);
                break;
            case 1:
                ac0 ac0Var2 = this.b;
                ac0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(ac0Var2.r.b);
                break;
            default:
                pf.d.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
