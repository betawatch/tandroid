package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ao0 implements mo0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ oo0 b;

    public ao0(oo0 oo0Var, Runnable runnable) {
        this.b = oo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.mo0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        oo0 oo0Var = this.b;
        oo0Var.y0 = tL_paymentSavedCredentialsCard;
        oo0Var.w0 = str;
        oo0Var.U0 = z10;
        oo0Var.x0 = str2;
        oo0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.d9[] d9VarArr = oo0Var.Y;
        org.telegram.ui.Cells.d9 d9Var = d9VarArr[0];
        if (d9Var != null) {
            d9Var.setVisibility(0);
            org.telegram.ui.Cells.d9 d9Var2 = d9VarArr[0];
            String str4 = oo0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = oo0Var.x0;
            } else {
                str3 = oo0Var.x0.substring(0, 1).toUpperCase() + oo0Var.x0.substring(1);
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

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.mo0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
