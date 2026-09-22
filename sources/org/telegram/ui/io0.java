package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class io0 implements uo0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ wo0 b;

    public io0(wo0 wo0Var, Runnable runnable) {
        this.b = wo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.uo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        wo0 wo0Var = this.b;
        wo0Var.y0 = tL_paymentSavedCredentialsCard;
        wo0Var.w0 = str;
        wo0Var.U0 = z10;
        wo0Var.x0 = str2;
        wo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = wo0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = wo0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = wo0Var.x0;
            } else {
                str3 = wo0Var.x0.substring(0, 1).toUpperCase() + wo0Var.x0.substring(1);
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

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.uo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
