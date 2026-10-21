package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final /* synthetic */ class cn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ eo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ cn0(eo0 eo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = eo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                eo0 eo0Var = this.b;
                eo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    eo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(eo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = eo0Var.C0;
                        if (paymentForm != null && eo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            eo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(eo0Var.a0);
                        eo0 eo0Var2 = eo0Var.f0;
                        if (eo0Var2 != null) {
                            eo0Var2.C0(eo0Var.a0);
                        }
                        if (!eo0Var.a0.has_password && eo0Var.d0 == null) {
                            an0 an0Var = new an0(eo0Var, 3);
                            eo0Var.d0 = an0Var;
                            AndroidUtilities.runOnUIThread(an0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                eo0.V(this.b, this.c, this.d);
                break;
            default:
                eo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
