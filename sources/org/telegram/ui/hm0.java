package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class hm0 implements om0 {
    public final /* synthetic */ qm0 a;

    public hm0(qm0 qm0Var) {
        this.a = qm0Var;
    }

    @Override // org.telegram.ui.om0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.om0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.om0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        qm0 qm0Var = this.a;
        om0 om0Var = qm0Var.T;
        if (om0Var != null) {
            om0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (qm0Var.S0) {
            qm0Var.removeSelfFromStack();
        }
        return qm0Var.T != null;
    }

    @Override // org.telegram.ui.om0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
