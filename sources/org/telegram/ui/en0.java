package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ go0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ en0(go0 go0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = go0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                go0 go0Var = this.b;
                go0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    go0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.w0(go0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = go0Var.C0;
                        if (paymentForm != null && go0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            go0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(go0Var.a0);
                        go0 go0Var2 = go0Var.f0;
                        if (go0Var2 != null) {
                            go0Var2.C0(go0Var.a0);
                        }
                        if (!go0Var.a0.has_password && go0Var.d0 == null) {
                            cn0 cn0Var = new cn0(go0Var, 3);
                            go0Var.d0 = cn0Var;
                            AndroidUtilities.runOnUIThread(cn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                go0.V(this.b, this.c, this.d);
                break;
            default:
                go0.X(this.b, this.c, this.d);
                break;
        }
    }
}
