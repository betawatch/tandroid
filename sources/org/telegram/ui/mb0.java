package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ xb0 b;

    public /* synthetic */ mb0(xb0 xb0Var, int i10) {
        this.a = i10;
        this.b = xb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                xb0 xb0Var = this.b;
                xb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(xb0Var.r.b);
                break;
            case 1:
                xb0 xb0Var2 = this.b;
                xb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(xb0Var2.r.b);
                break;
            default:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
