package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ qo0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ pn0(qo0 qo0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = qo0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                qo0 qo0Var = this.b;
                qo0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    qo0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.e5.x0(qo0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = qo0Var.C0;
                        if (paymentForm != null && qo0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            qo0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(qo0Var.a0);
                        qo0 qo0Var2 = qo0Var.f0;
                        if (qo0Var2 != null) {
                            qo0Var2.C0(qo0Var.a0);
                        }
                        if (!qo0Var.a0.has_password && qo0Var.d0 == null) {
                            nn0 nn0Var = new nn0(qo0Var, 3);
                            qo0Var.d0 = nn0Var;
                            AndroidUtilities.runOnUIThread(nn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                qo0.V(this.b, this.c, this.d);
                break;
            default:
                qo0.X(this.b, this.c, this.d);
                break;
        }
    }
}
