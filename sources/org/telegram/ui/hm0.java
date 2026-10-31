package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class hm0 implements qm0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ sm0 b;

    public hm0(sm0 sm0Var, Runnable runnable) {
        this.b = sm0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.qm0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        sm0 sm0Var = this.b;
        sm0Var.y0 = tL_paymentSavedCredentialsCard;
        sm0Var.w0 = str;
        sm0Var.U0 = z10;
        sm0Var.x0 = str2;
        sm0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.a9[] a9VarArr = sm0Var.Y;
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[0];
        if (a9Var != null) {
            a9Var.setVisibility(0);
            org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[0];
            String str4 = sm0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = sm0Var.x0;
            } else {
                str3 = sm0Var.x0.substring(0, 1).toUpperCase() + sm0Var.x0.substring(1);
            }
            a9Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.cd.L0(2131747430, null), true);
            org.telegram.ui.Cells.a9 a9Var3 = a9VarArr[1];
            if (a9Var3 != null) {
                a9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.qm0
    public final /* synthetic */ void b() {
    }
}
