package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class fo0 implements po0 {
    public final /* synthetic */ ro0 a;

    public fo0(ro0 ro0Var) {
        this.a = ro0Var;
    }

    @Override // org.telegram.ui.po0
    public final void a(TL_account.Password password) {
        this.a.a0 = password;
    }

    @Override // org.telegram.ui.po0
    public final void b() {
        this.a.f0 = null;
    }

    @Override // org.telegram.ui.po0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ro0 ro0Var = this.a;
        po0 po0Var = ro0Var.T;
        if (po0Var != null) {
            po0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ro0Var.S0) {
            ro0Var.removeSelfFromStack();
        }
        return ro0Var.T != null;
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
