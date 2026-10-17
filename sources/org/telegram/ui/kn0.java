package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class kn0 implements do0 {
    public final /* synthetic */ fo0 a;

    public kn0(fo0 fo0Var) {
        this.a = fo0Var;
    }

    @Override // org.telegram.ui.do0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.do0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        fo0 fo0Var = this.a;
        fo0Var.I0 = tL_payments_validateRequestedInfo;
        fo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.do0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.do0
    public final /* synthetic */ void b() {
    }
}
