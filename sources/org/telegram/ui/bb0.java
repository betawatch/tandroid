package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nb0 b;

    public /* synthetic */ bb0(nb0 nb0Var, int i10) {
        this.a = i10;
        this.b = nb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                nb0 nb0Var = this.b;
                nb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(nb0Var.r.b);
                break;
            case 1:
                nb0 nb0Var2 = this.b;
                nb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(nb0Var2.r.b);
                break;
            default:
                af.g.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
