package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final /* synthetic */ class mn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ mn0(lo0 lo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = lo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                lo0 lo0Var = this.b;
                lo0Var.b0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    lo0Var.X = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.z4.x0(lo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = lo0Var.z0;
                        if (paymentForm != null && lo0Var.X.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            lo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(lo0Var.X);
                        lo0 lo0Var2 = lo0Var.c0;
                        if (lo0Var2 != null) {
                            lo0Var2.C0(lo0Var.X);
                        }
                        if (!lo0Var.X.has_password && lo0Var.a0 == null) {
                            kn0 kn0Var = new kn0(lo0Var, 3);
                            lo0Var.a0 = kn0Var;
                            AndroidUtilities.runOnUIThread(kn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                lo0.V(this.b, this.c, this.d);
                break;
            default:
                lo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
