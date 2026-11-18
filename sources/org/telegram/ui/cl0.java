package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class cl0 implements kl0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ ml0 b;

    public cl0(ml0 ml0Var, Runnable runnable) {
        this.b = ml0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.kl0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        ml0 ml0Var = this.b;
        ml0Var.z0 = tL_paymentSavedCredentialsCard;
        ml0Var.x0 = str;
        ml0Var.V0 = z10;
        ml0Var.y0 = str2;
        ml0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = ml0Var.Z;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = ml0Var.y0;
            if (str4 == null || str4.length() <= 1) {
                str3 = ml0Var.y0;
            } else {
                str3 = ml0Var.y0.substring(0, 1).toUpperCase() + ml0Var.y0.substring(1);
            }
            y8Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.gd.M0(2131747221, null), true);
            org.telegram.ui.Cells.y8 y8Var3 = y8VarArr[1];
            if (y8Var3 != null) {
                y8Var3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.kl0
    public final /* synthetic */ void b() {
    }
}
