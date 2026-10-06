package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
/* loaded from: classes3.dex */
public final class go0 implements qo0 {
    public final /* synthetic */ so0 a;

    public go0(so0 so0Var) {
        this.a = so0Var;
    }

    @Override // org.telegram.ui.qo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.qo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.qo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        so0 so0Var = this.a;
        qo0 qo0Var = so0Var.T;
        if (qo0Var != null) {
            qo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (so0Var.S0) {
            so0Var.removeSelfFromStack();
        }
        return so0Var.T != null;
    }

    @Override // org.telegram.ui.qo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
