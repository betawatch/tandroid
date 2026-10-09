package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ho0 implements to0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ vo0 b;

    public ho0(vo0 vo0Var, Runnable runnable) {
        this.b = vo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.to0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        vo0 vo0Var = this.b;
        vo0Var.y0 = tL_paymentSavedCredentialsCard;
        vo0Var.w0 = str;
        vo0Var.U0 = z10;
        vo0Var.x0 = str2;
        vo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = vo0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = vo0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = vo0Var.x0;
            } else {
                str3 = vo0Var.x0.substring(0, 1).toUpperCase() + vo0Var.x0.substring(1);
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

    @Override // org.telegram.ui.to0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.to0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.to0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
