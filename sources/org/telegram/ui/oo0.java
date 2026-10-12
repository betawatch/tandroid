package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class oo0 implements ap0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ cp0 b;

    public oo0(cp0 cp0Var, Runnable runnable) {
        this.b = cp0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.ap0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        cp0 cp0Var = this.b;
        cp0Var.y0 = tL_paymentSavedCredentialsCard;
        cp0Var.w0 = str;
        cp0Var.U0 = z10;
        cp0Var.x0 = str2;
        cp0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = cp0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = cp0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = cp0Var.x0;
            } else {
                str3 = cp0Var.x0.substring(0, 1).toUpperCase() + cp0Var.x0.substring(1);
            }
            d9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.d9 d9Var3 = d9VarArr[1];
            if (d9Var3 != null) {
                d9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.ap0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
