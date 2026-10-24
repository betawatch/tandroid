package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class pn0 implements go0 {
    public final /* synthetic */ io0 a;

    public pn0(io0 io0Var) {
        this.a = io0Var;
    }

    @Override // org.telegram.ui.go0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.go0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        io0 io0Var = this.a;
        io0Var.I0 = tL_payments_validateRequestedInfo;
        io0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.go0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.go0
    public final /* synthetic */ void b() {
    }
}
