package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class bm0 implements qm0 {
    public final /* synthetic */ sm0 a;

    public bm0(sm0 sm0Var) {
        this.a = sm0Var;
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.qm0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        sm0 sm0Var = this.a;
        sm0Var.I0 = tL_payments_validateRequestedInfo;
        sm0Var.G0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ void b() {
    }
}
