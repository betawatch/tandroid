package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class pn0 implements ao0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ co0 b;

    public pn0(co0 co0Var, Runnable runnable) {
        this.b = co0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.ao0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        co0 co0Var = this.b;
        co0Var.u0 = tL_paymentSavedCredentialsCard;
        co0Var.s0 = str;
        co0Var.Q0 = z10;
        co0Var.t0 = str2;
        co0Var.F0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.a9[] a9VarArr = co0Var.U;
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[0];
        if (a9Var != null) {
            a9Var.setVisibility(0);
            org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[0];
            String str4 = co0Var.t0;
            if (str4 == null || str4.length() <= 1) {
                str3 = co0Var.t0;
            } else {
                str3 = co0Var.t0.substring(0, 1).toUpperCase() + co0Var.t0.substring(1);
            }
            a9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
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

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.ao0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
