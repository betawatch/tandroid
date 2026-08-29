package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pn0 implements zn0 {
    public final /* synthetic */ bo0 a;

    public pn0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // org.telegram.ui.zn0
    public final void a(TL_account.Password password) {
        this.a.W = password;
    }

    @Override // org.telegram.ui.zn0
    public final void b() {
        this.a.b0 = null;
    }

    @Override // org.telegram.ui.zn0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        bo0 bo0Var = this.a;
        zn0 zn0Var = bo0Var.P;
        if (zn0Var != null) {
            zn0Var.c(str, str2, z10, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (bo0Var.O0) {
            bo0Var.removeSelfFromStack();
        }
        return bo0Var.P != null;
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
