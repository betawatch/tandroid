package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class bl0 implements il0 {
    public final /* synthetic */ kl0 a;

    public bl0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // org.telegram.ui.il0
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override // org.telegram.ui.il0
    public final void b() {
        this.a.g0 = null;
    }

    @Override // org.telegram.ui.il0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        kl0 kl0Var = this.a;
        il0 il0Var = kl0Var.U;
        if (il0Var != null) {
            il0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (kl0Var.T0) {
            kl0Var.removeSelfFromStack();
        }
        return kl0Var.U != null;
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
