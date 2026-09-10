package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ko0 implements uo0 {
    public final /* synthetic */ wo0 a;

    public ko0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // org.telegram.ui.uo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.uo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.uo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        wo0 wo0Var = this.a;
        uo0 uo0Var = wo0Var.T;
        if (uo0Var != null) {
            uo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (wo0Var.S0) {
            wo0Var.removeSelfFromStack();
        }
        return wo0Var.T != null;
    }

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
