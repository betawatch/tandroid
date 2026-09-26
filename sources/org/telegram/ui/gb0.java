package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ rb0 b;

    public /* synthetic */ gb0(rb0 rb0Var, int i10) {
        this.a = i10;
        this.b = rb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                rb0 rb0Var = this.b;
                rb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(rb0Var.r.b);
                break;
            case 1:
                rb0 rb0Var2 = this.b;
                rb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(rb0Var2.r.b);
                break;
            default:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
