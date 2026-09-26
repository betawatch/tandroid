package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class co0 implements mo0 {
    public final /* synthetic */ oo0 a;

    public co0(oo0 oo0Var) {
        this.a = oo0Var;
    }

    @Override // org.telegram.ui.mo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.mo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.mo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        oo0 oo0Var = this.a;
        mo0 mo0Var = oo0Var.T;
        if (mo0Var != null) {
            mo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (oo0Var.S0) {
            oo0Var.removeSelfFromStack();
        }
        return oo0Var.T != null;
    }

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
