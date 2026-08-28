package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class kn0 implements ao0 {
    public final /* synthetic */ co0 a;

    public kn0(co0 co0Var) {
        this.a = co0Var;
    }

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.ao0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        co0 co0Var = this.a;
        co0Var.E0 = tL_payments_validateRequestedInfo;
        co0Var.A0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ void b() {
    }
}
