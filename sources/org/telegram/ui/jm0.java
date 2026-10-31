package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class jm0 implements qm0 {
    public final /* synthetic */ sm0 a;

    public jm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // org.telegram.ui.qm0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.qm0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.qm0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        sm0 sm0Var = this.a;
        qm0 qm0Var = sm0Var.T;
        if (qm0Var != null) {
            qm0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (sm0Var.S0) {
            sm0Var.removeSelfFromStack();
        }
        return sm0Var.T != null;
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
