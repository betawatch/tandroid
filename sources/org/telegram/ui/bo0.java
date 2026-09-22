package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class bo0 implements uo0 {
    public final /* synthetic */ wo0 a;

    public bo0(wo0 wo0Var) {
        this.a = wo0Var;
    }

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.uo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        wo0 wo0Var = this.a;
        wo0Var.I0 = tL_payments_validateRequestedInfo;
        wo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ void b() {
    }
}
