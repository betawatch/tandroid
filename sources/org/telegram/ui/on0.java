package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class on0 implements zn0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ bo0 b;

    public on0(bo0 bo0Var, Runnable runnable) {
        this.b = bo0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.zn0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        bo0 bo0Var = this.b;
        bo0Var.u0 = tL_paymentSavedCredentialsCard;
        bo0Var.s0 = str;
        bo0Var.Q0 = z10;
        bo0Var.t0 = str2;
        bo0Var.F0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.x8[] x8VarArr = bo0Var.U;
        org.telegram.ui.Cells.x8 x8Var = x8VarArr[0];
        if (x8Var != null) {
            x8Var.setVisibility(0);
            org.telegram.ui.Cells.x8 x8Var2 = x8VarArr[0];
            String str4 = bo0Var.t0;
            if (str4 == null || str4.length() <= 1) {
                str3 = bo0Var.t0;
            } else {
                str3 = bo0Var.t0.substring(0, 1).toUpperCase() + bo0Var.t0.substring(1);
            }
            x8Var2.b(R.drawable.msg_payment_card, str3, LocaleController.getString(R.string.PaymentCheckoutMethod), true);
            org.telegram.ui.Cells.x8 x8Var3 = x8VarArr[1];
            if (x8Var3 != null) {
                x8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ void b() {
    }

    @Override // org.telegram.ui.zn0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
