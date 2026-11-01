package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fm0 implements om0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ qm0 b;

    public fm0(qm0 qm0Var, Runnable runnable) {
        this.b = qm0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.om0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        qm0 qm0Var = this.b;
        qm0Var.y0 = tL_paymentSavedCredentialsCard;
        qm0Var.w0 = str;
        qm0Var.U0 = z10;
        qm0Var.x0 = str2;
        qm0Var.J0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.a9[] a9VarArr = qm0Var.Y;
        org.telegram.ui.Cells.a9 a9Var = a9VarArr[0];
        if (a9Var != null) {
            a9Var.setVisibility(0);
            org.telegram.ui.Cells.a9 a9Var2 = a9VarArr[0];
            String str4 = qm0Var.x0;
            if (str4 == null || str4.length() <= 1) {
                str3 = qm0Var.x0;
            } else {
                str3 = qm0Var.x0.substring(0, 1).toUpperCase() + qm0Var.x0.substring(1);
            }
            a9Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.dd.L0(2131747430, null), true);
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

    @Override // org.telegram.ui.om0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.om0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.om0
    public final /* synthetic */ void b() {
    }
}
