package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class db0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pb0 b;

    public /* synthetic */ db0(pb0 pb0Var, int i10) {
        this.a = i10;
        this.b = pb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pb0 pb0Var = this.b;
                pb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(pb0Var.r.b);
                break;
            case 1:
                pb0 pb0Var2 = this.b;
                pb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(pb0Var2.r.b);
                break;
            default:
                ze.d.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
