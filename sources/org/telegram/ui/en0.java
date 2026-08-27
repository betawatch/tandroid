package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ do0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ en0(do0 do0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = do0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                do0 do0Var = this.b;
                do0Var.a0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    do0Var.W = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.y4.x0(do0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = do0Var.y0;
                        if (paymentForm != null && do0Var.W.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            do0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(do0Var.W);
                        do0 do0Var2 = do0Var.b0;
                        if (do0Var2 != null) {
                            do0Var2.C0(do0Var.W);
                        }
                        if (!do0Var.W.has_password && do0Var.Z == null) {
                            cn0 cn0Var = new cn0(do0Var, 3);
                            do0Var.Z = cn0Var;
                            AndroidUtilities.runOnUIThread(cn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                do0.V(this.b, this.c, this.d);
                break;
            default:
                do0.X(this.b, this.c, this.d);
                break;
        }
    }
}
