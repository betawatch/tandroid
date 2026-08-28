package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ co0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ dn0(co0 co0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = co0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                co0 co0Var = this.b;
                co0Var.a0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    co0Var.W = password;
                    if (!TwoStepVerificationActivity.h0(password, false)) {
                        org.telegram.ui.Components.y4.x0(co0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = co0Var.y0;
                        if (paymentForm != null && co0Var.W.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            co0Var.K0();
                        }
                        TwoStepVerificationActivity.l0(co0Var.W);
                        co0 co0Var2 = co0Var.b0;
                        if (co0Var2 != null) {
                            co0Var2.B0(co0Var.W);
                        }
                        if (!co0Var.W.has_password && co0Var.Z == null) {
                            bn0 bn0Var = new bn0(co0Var, 3);
                            co0Var.Z = bn0Var;
                            AndroidUtilities.runOnUIThread(bn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                co0.U(this.b, this.c, this.d);
                break;
            default:
                co0.W(this.b, this.c, this.d);
                break;
        }
    }
}
