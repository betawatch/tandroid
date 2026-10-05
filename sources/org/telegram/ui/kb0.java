package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ vb0 b;

    public /* synthetic */ kb0(vb0 vb0Var, int i10) {
        this.a = i10;
        this.b = vb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                vb0 vb0Var = this.b;
                vb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(vb0Var.r.b);
                break;
            case 1:
                vb0 vb0Var2 = this.b;
                vb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(vb0Var2.r.b);
                break;
            default:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
