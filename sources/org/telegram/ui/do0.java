package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class do0 implements no0 {
    public final /* synthetic */ po0 a;

    public do0(po0 po0Var) {
        this.a = po0Var;
    }

    @Override // org.telegram.ui.no0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.no0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.no0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        po0 po0Var = this.a;
        no0 no0Var = po0Var.T;
        if (no0Var != null) {
            no0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (po0Var.S0) {
            po0Var.removeSelfFromStack();
        }
        return po0Var.T != null;
    }

    @Override // org.telegram.ui.no0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
