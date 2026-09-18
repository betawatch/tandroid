package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class mo0 implements wo0 {
    public final /* synthetic */ yo0 a;

    public mo0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // org.telegram.ui.wo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.wo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.wo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        yo0 yo0Var = this.a;
        wo0 wo0Var = yo0Var.T;
        if (wo0Var != null) {
            wo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (yo0Var.S0) {
            yo0Var.removeSelfFromStack();
        }
        return yo0Var.T != null;
    }

    @Override // org.telegram.ui.wo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
