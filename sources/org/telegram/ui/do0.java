package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class do0 implements po0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ ro0 b;

    public do0(ro0 ro0Var, Runnable runnable) {
        this.b = ro0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.po0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        ro0 ro0Var = this.b;
        ro0Var.y0 = tL_paymentSavedCredentialsCard;
        ro0Var.w0 = str;
        ro0Var.U0 = z10;
        ro0Var.x0 = str2;
        ro0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.h9[] h9VarArr = ro0Var.Y;
        org.telegram.ui.Cells.h9 h9Var = h9VarArr[0];
        if (h9Var != null) {
            h9Var.setVisibility(0);
            org.telegram.ui.Cells.h9 h9Var2 = h9VarArr[0];
            String str4 = ro0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = ro0Var.x0;
            } else {
                str3 = ro0Var.x0.substring(0, 1).toUpperCase() + ro0Var.x0.substring(1);
            }
            h9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.h9 h9Var3 = h9VarArr[1];
            if (h9Var3 != null) {
                h9Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.po0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
