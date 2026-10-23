package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class kn0 implements co0 {
    public final /* synthetic */ eo0 a;

    public kn0(eo0 eo0Var) {
        this.a = eo0Var;
    }

    @Override // org.telegram.ui.co0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.co0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        eo0 eo0Var = this.a;
        eo0Var.I0 = tL_payments_validateRequestedInfo;
        eo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.co0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.co0
    public final /* synthetic */ void b() {
    }
}
