package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nk0 implements bl0 {
    public final /* synthetic */ dl0 a;

    public nk0(dl0 dl0Var) {
        this.a = dl0Var;
    }

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.bl0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        dl0 dl0Var = this.a;
        dl0Var.J0 = tL_payments_validateRequestedInfo;
        dl0Var.H0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.bl0
    public final /* synthetic */ void b() {
    }
}
