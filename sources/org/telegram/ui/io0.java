package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
        org.telegram.ui.Cells.e9[] e9VarArr = wo0Var.Y;
        org.telegram.ui.Cells.e9 e9Var = e9VarArr[0];
        if (e9Var != null) {
            e9Var.setVisibility(0);
            org.telegram.ui.Cells.e9 e9Var2 = e9VarArr[0];
            String str4 = wo0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = wo0Var.x0;
            } else {
                str3 = wo0Var.x0.substring(0, 1).toUpperCase() + wo0Var.x0.substring(1);
            }
            e9Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.e9 e9Var3 = e9VarArr[1];
            if (e9Var3 != null) {
                e9Var3.setVisibility(0);
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
