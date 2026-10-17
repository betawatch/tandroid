package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ en0(fo0 fo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = fo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fo0 fo0Var = this.b;
                fo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    fo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(fo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = fo0Var.C0;
                        if (paymentForm != null && fo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            fo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(fo0Var.a0);
                        fo0 fo0Var2 = fo0Var.f0;
                        if (fo0Var2 != null) {
                            fo0Var2.C0(fo0Var.a0);
                        }
                        if (!fo0Var.a0.has_password && fo0Var.d0 == null) {
                            cn0 cn0Var = new cn0(fo0Var, 3);
                            fo0Var.d0 = cn0Var;
                            AndroidUtilities.runOnUIThread(cn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                fo0.V(this.b, this.c, this.d);
                break;
            default:
                fo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
