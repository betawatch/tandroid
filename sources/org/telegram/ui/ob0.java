package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ob0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ zb0 b;

    public /* synthetic */ ob0(zb0 zb0Var, int i10) {
        this.a = i10;
        this.b = zb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                zb0 zb0Var = this.b;
                zb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(zb0Var.r.b);
                break;
            case 1:
                zb0 zb0Var2 = this.b;
                zb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(zb0Var2.r.b);
                break;
            default:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
