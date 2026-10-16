package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class oo0 implements yo0 {
    public final /* synthetic */ ap0 a;

    public oo0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override // org.telegram.ui.yo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.yo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.yo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ap0 ap0Var = this.a;
        yo0 yo0Var = ap0Var.T;
        if (yo0Var != null) {
            yo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ap0Var.S0) {
            ap0Var.removeSelfFromStack();
        }
        return ap0Var.T != null;
    }

    @Override // org.telegram.ui.yo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
