// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class m18 implements v18 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ p b;

    public m18(p pVar, Runnable runnable) {
        this.b = pVar;
        this.a = runnable;
    }

    @Override // v18
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        p pVar = this.b;
        pVar.z0 = tL_paymentSavedCredentialsCard;
        pVar.x0 = str;
        pVar.V0 = z;
        pVar.y0 = str2;
        pVar.K0 = tL_inputPaymentCredentialsGooglePay;
        ijb[] ijbVarArr = pVar.Z;
        ijb ijbVar = ijbVarArr[0];
        if (ijbVar != null) {
            ijbVar.setVisibility(0);
            ijb ijbVar2 = ijbVarArr[0];
            String str4 = pVar.y0;
            if (str4 == null || str4.length() <= 1) {
                str3 = pVar.y0;
            } else {
                str3 = pVar.y0.substring(0, 1).toUpperCase() + pVar.y0.substring(1);
            }
            ijbVar2.b(R.drawable.msg_payment_card, str3, jb6.M0(2131747147, null), true);
            ijb ijbVar3 = ijbVarArr[1];
            if (ijbVar3 != null) {
                ijbVar3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // v18
    public final void a(TL_account.Password password) {
    }

    @Override // v18
    public final void b() {
    }

    @Override // v18
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
