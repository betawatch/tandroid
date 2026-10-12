package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class jo0 implements ap0 {
    public final /* synthetic */ cp0 a;

    public jo0(cp0 cp0Var) {
        this.a = cp0Var;
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.ap0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        cp0 cp0Var = this.a;
        cp0Var.I0 = tL_payments_validateRequestedInfo;
        cp0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ void b() {
    }
}
