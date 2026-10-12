package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class bo0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cp0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ bo0(cp0 cp0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = cp0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cp0 cp0Var = this.b;
                cp0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    cp0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.g5.w0(cp0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = cp0Var.C0;
                        if (paymentForm != null && cp0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            cp0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(cp0Var.a0);
                        cp0 cp0Var2 = cp0Var.f0;
                        if (cp0Var2 != null) {
                            cp0Var2.C0(cp0Var.a0);
                        }
                        if (!cp0Var.a0.has_password && cp0Var.d0 == null) {
                            zn0 zn0Var = new zn0(cp0Var, 3);
                            cp0Var.d0 = zn0Var;
                            AndroidUtilities.runOnUIThread(zn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                cp0.V(this.b, this.c, this.d);
                break;
            default:
                cp0.X(this.b, this.c, this.d);
                break;
        }
    }
}
