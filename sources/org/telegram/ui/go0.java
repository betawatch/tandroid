package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class go0 implements wo0 {
    public final /* synthetic */ yo0 a;

    public go0(yo0 yo0Var) {
        this.a = yo0Var;
    }

    @Override // org.telegram.ui.wo0
    public final /* synthetic */ boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // org.telegram.ui.wo0
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        yo0 yo0Var = this.a;
        yo0Var.I0 = tL_payments_validateRequestedInfo;
        yo0Var.B0(tL_payments_validateRequestedInfo.info);
    }

    @Override // org.telegram.ui.wo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.wo0
    public final /* synthetic */ void b() {
    }
}
