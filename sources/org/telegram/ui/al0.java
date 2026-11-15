package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class al0 implements hl0 {
    public final /* synthetic */ jl0 a;

    public al0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.hl0
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override // org.telegram.ui.hl0
    public final void b() {
        this.a.g0 = null;
    }

    @Override // org.telegram.ui.hl0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        jl0 jl0Var = this.a;
        hl0 hl0Var = jl0Var.U;
        if (hl0Var != null) {
            hl0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (jl0Var.T0) {
            jl0Var.removeSelfFromStack();
        }
        return jl0Var.U != null;
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
