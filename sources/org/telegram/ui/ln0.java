package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ln0 implements eo0 {
    public final /* synthetic */ go0 a;

    public ln0(go0 go0Var) {
        this.a = go0Var;
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.eo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        go0 go0Var = this.a;
        go0Var.I0 = tL_payments_validateRequestedInfo;
        go0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.eo0
    public final /* synthetic */ void b() {
    }
}
