package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class ln0 implements co0 {
    public final /* synthetic */ eo0 a;

    public ln0(eo0 eo0Var) {
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
