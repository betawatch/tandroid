package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ oo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ nn0(oo0 oo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = oo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                oo0 oo0Var = this.b;
                oo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    oo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(oo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = oo0Var.C0;
                        if (paymentForm != null && oo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            oo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(oo0Var.a0);
                        oo0 oo0Var2 = oo0Var.f0;
                        if (oo0Var2 != null) {
                            oo0Var2.C0(oo0Var.a0);
                        }
                        if (!oo0Var.a0.has_password && oo0Var.d0 == null) {
                            ln0 ln0Var = new ln0(oo0Var, 3);
                            oo0Var.d0 = ln0Var;
                            AndroidUtilities.runOnUIThread(ln0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                oo0.V(this.b, this.c, this.d);
                break;
            default:
                oo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
