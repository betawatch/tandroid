package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ho0 implements yo0 {
    public final /* synthetic */ ap0 a;

    public ho0(ap0 ap0Var) {
        this.a = ap0Var;
    }

    @Override // org.telegram.ui.yo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.yo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        ap0 ap0Var = this.a;
        ap0Var.I0 = tL_payments_validateRequestedInfo;
        ap0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.yo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.yo0
    public final /* synthetic */ void b() {
    }
}
