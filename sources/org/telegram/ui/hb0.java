package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class hb0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ sb0 b;

    public /* synthetic */ hb0(sb0 sb0Var, int i10) {
        this.a = i10;
        this.b = sb0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                sb0 sb0Var = this.b;
                sb0Var.r.b.requestFocus();
                AndroidUtilities.showKeyboard(sb0Var.r.b);
                break;
            case 1:
                sb0 sb0Var2 = this.b;
                sb0Var2.r.b.clearFocus();
                AndroidUtilities.hideKeyboard(sb0Var2.r.b);
                break;
            default:
                nf.f.s(this.b.getParentActivity(), LocaleController.getString(R.string.RequireMonthlyFeeInfoLink));
                break;
        }
    }
}
