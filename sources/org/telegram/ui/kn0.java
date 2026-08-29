package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class kn0 implements zn0 {
    public final /* synthetic */ bo0 a;

    public kn0(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.zn0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        bo0 bo0Var = this.a;
        bo0Var.E0 = tL_payments_validateRequestedInfo;
        bo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ void b() {
    }
}
