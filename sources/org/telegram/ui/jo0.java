package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jo0 implements to0 {
    public final /* synthetic */ vo0 a;

    public jo0(vo0 vo0Var) {
        this.a = vo0Var;
    }

    @Override // org.telegram.ui.to0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.to0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.to0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        vo0 vo0Var = this.a;
        to0 to0Var = vo0Var.T;
        if (to0Var != null) {
            to0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (vo0Var.S0) {
            vo0Var.removeSelfFromStack();
        }
        return vo0Var.T != null;
    }

    @Override // org.telegram.ui.to0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
