package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class lo0 implements vo0 {
    public final /* synthetic */ xo0 a;

    public lo0(xo0 xo0Var) {
        this.a = xo0Var;
    }

    @Override // org.telegram.ui.vo0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.vo0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.vo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        xo0 xo0Var = this.a;
        vo0 vo0Var = xo0Var.T;
        if (vo0Var != null) {
            vo0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (xo0Var.S0) {
            xo0Var.removeSelfFromStack();
        }
        return xo0Var.T != null;
    }

    @Override // org.telegram.ui.vo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
