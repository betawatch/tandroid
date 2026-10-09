package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class co0 implements to0 {
    public final /* synthetic */ vo0 a;

    public co0(vo0 vo0Var) {
        this.a = vo0Var;
    }

    @Override // org.telegram.ui.to0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.to0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        vo0 vo0Var = this.a;
        vo0Var.I0 = tL_payments_validateRequestedInfo;
        vo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.to0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.to0
    public final /* synthetic */ void b() {
    }
}
