package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ kn0(jo0 jo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = jo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jo0 jo0Var = this.b;
                jo0Var.b0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    jo0Var.X = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(jo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = jo0Var.z0;
                        if (paymentForm != null && jo0Var.X.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            jo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(jo0Var.X);
                        jo0 jo0Var2 = jo0Var.c0;
                        if (jo0Var2 != null) {
                            jo0Var2.C0(jo0Var.X);
                        }
                        if (!jo0Var.X.has_password && jo0Var.a0 == null) {
                            in0 in0Var = new in0(jo0Var, 3);
                            jo0Var.a0 = in0Var;
                            AndroidUtilities.runOnUIThread(in0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                jo0.V(this.b, this.c, this.d);
                break;
            default:
                jo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
