package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e83daa4a3f4c5cc77b567d3f921056f729108399460aa18047e0e51e076a97b3 */
/* loaded from: classes3.dex */
public final class fo0 implements vo0 {
    public final /* synthetic */ xo0 a;

    public fo0(xo0 xo0Var) {
        this.a = xo0Var;
    }

    @Override // org.telegram.ui.vo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.vo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        xo0 xo0Var = this.a;
        xo0Var.I0 = tL_payments_validateRequestedInfo;
        xo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.vo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.vo0
    public final /* synthetic */ void b() {
    }
}
