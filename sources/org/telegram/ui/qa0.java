package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class qa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bb0 b;

    public /* synthetic */ qa0(bb0 bb0Var, int i9) {
        this.a = i9;
        this.b = bb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                bb0 bb0Var = this.b;
                bb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(bb0Var.r.b);
                break;
            case 1:
                bb0 bb0Var2 = this.b;
                bb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(bb0Var2.r.b);
                break;
            default:
                ve.e.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
