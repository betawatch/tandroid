// default package

import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;

/* compiled from: r8-map-id-17f7ce538f136bbfd364b7b4fa0ec4503cad241dabbd51fce4dcf622535aa29f */
/* loaded from: classes2.dex */
public final class jz7 implements sz7 {
    public final /* synthetic */ Runnable a;
    public final /* synthetic */ p b;

    public jz7(p pVar, Runnable runnable) {
        this.b = pVar;
        this.a = runnable;
    }

    @Override // sz7
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        String str3;
        p pVar = this.b;
        pVar.z0 = tL_paymentSavedCredentialsCard;
        pVar.x0 = str;
        pVar.V0 = z;
        pVar.y0 = str2;
        pVar.K0 = tL_inputPaymentCredentialsGooglePay;
        hhb[] hhbVarArr = pVar.Z;
        hhb hhbVar = hhbVarArr[0];
        if (hhbVar != null) {
            hhbVar.setVisibility(0);
            hhb hhbVar2 = hhbVarArr[0];
            String str4 = pVar.y0;
            if (str4 == null || str4.length() <= 1) {
                str3 = pVar.y0;
            } else {
                str3 = pVar.y0.substring(0, 1).toUpperCase() + pVar.y0.substring(1);
            }
            hhbVar2.b(R.drawable.msg_payment_card, str3, k96.M0(2131747221, null), true);
            hhb hhbVar3 = hhbVarArr[1];
            if (hhbVar3 != null) {
                hhbVar3.setVisibility(0);
            }
        }
        Runnable runnable = this.a;
        if (runnable != null) {
            runnable.run();
        }
        return false;
    }

    @Override // sz7
    public final void b() {
    }

    @Override // sz7
    public final void a(TL_account.Password password) {
    }

    @Override // sz7
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
