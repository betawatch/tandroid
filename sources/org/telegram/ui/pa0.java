package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pa0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ab0 b;

    public /* synthetic */ pa0(ab0 ab0Var, int i10) {
        this.a = i10;
        this.b = ab0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ab0 ab0Var = this.b;
                ab0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(ab0Var.r.b);
                break;
            case 1:
                ab0 ab0Var2 = this.b;
                ab0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(ab0Var2.r.b);
                break;
            default:
                pf.d.r(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
