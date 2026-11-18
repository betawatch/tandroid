package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dl0 implements kl0 {
    public final /* synthetic */ ml0 a;

    public dl0(ml0 ml0Var) {
        this.a = ml0Var;
    }

    @Override // org.telegram.ui.kl0
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override // org.telegram.ui.kl0
    public final void b() {
        this.a.g0 = null;
    }

    @Override // org.telegram.ui.kl0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        ml0 ml0Var = this.a;
        kl0 kl0Var = ml0Var.U;
        if (kl0Var != null) {
            kl0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (ml0Var.T0) {
            ml0Var.removeSelfFromStack();
        }
        return ml0Var.U != null;
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
