package org.telegram.ui;

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class al0 implements il0 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ kl0 b;

    public al0(kl0 kl0Var, Runnable runnable) {
        this.b = kl0Var;
        this.a = runnable;
    }

    @Override // org.telegram.ui.il0
    public final boolean c(String str, String str2, boolean z10, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        kl0 kl0Var = this.b;
        kl0Var.z0 = tL_paymentSavedCredentialsCard;
        kl0Var.x0 = str;
        kl0Var.V0 = z10;
        kl0Var.y0 = str2;
        kl0Var.K0 = tL_inputPaymentCredentialsGooglePay;
        org.telegram.ui.Cells.y8[] y8VarArr = kl0Var.Z;
        org.telegram.ui.Cells.y8 y8Var = y8VarArr[0];
        if (y8Var != null) {
            y8Var.setVisibility(0);
            org.telegram.ui.Cells.y8 y8Var2 = y8VarArr[0];
            String str4 = kl0Var.y0;
            if (str4 == null || str4.length() <= 1) {
                str3 = kl0Var.y0;
            } else {
                str3 = kl0Var.y0.substring(0, 1).toUpperCase() + kl0Var.y0.substring(1);
            }
            y8Var2.b(R.drawable.msg_payment_card, str3, org.telegram.messenger.gd.N0(2131747220, null), true);
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

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void a(TL_account.Password password) {
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }

    @Override // org.telegram.ui.il0
    public final /* synthetic */ void b() {
    }
}
