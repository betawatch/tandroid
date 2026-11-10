package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class bl0 implements il0 {
    public final /* synthetic */ kl0 a;

    public bl0(kl0 kl0Var) {
        this.a = kl0Var;
    }

    @Override // org.telegram.ui.il0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.il0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.il0
    public final boolean c(String str, String str2, boolean z9, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        kl0 kl0Var = this.a;
        il0 il0Var = kl0Var.T;
        if (il0Var != null) {
            il0Var.c(str, str2, z9, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (kl0Var.S0) {
            kl0Var.removeSelfFromStack();
        }
        return kl0Var.T != null;
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
