package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class al0 implements hl0 {
    public final /* synthetic */ jl0 a;

    public al0(jl0 jl0Var) {
        this.a = jl0Var;
    }

    @Override // org.telegram.ui.hl0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.hl0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.hl0
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        jl0 jl0Var = this.a;
        hl0 hl0Var = jl0Var.T;
        if (hl0Var != null) {
            hl0Var.c(str, str2, z9, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (jl0Var.S0) {
            jl0Var.removeSelfFromStack();
        }
        return jl0Var.T != null;
    }

    @Override // org.telegram.ui.hl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
