package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class kn0 implements bo0 {
    public final /* synthetic */ do0 a;

    public kn0(do0 do0Var) {
        this.a = do0Var;
    }

    @Override // org.telegram.ui.bo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.bo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        do0 do0Var = this.a;
        do0Var.E0 = tL_payments_validateRequestedInfo;
        do0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.bo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.bo0
    public final /* synthetic */ void b() {
    }
}
