package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class eo0 implements oo0 {
    public final /* synthetic */ qo0 a;

    public eo0(qo0 qo0Var) {
        this.a = qo0Var;
    }

    @Override // org.telegram.ui.oo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.oo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.oo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        qo0 qo0Var = this.a;
        oo0 oo0Var = qo0Var.T;
        if (oo0Var != null) {
            oo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (qo0Var.S0) {
            qo0Var.removeSelfFromStack();
        }
        return qo0Var.T != null;
    }

    @Override // org.telegram.ui.oo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
