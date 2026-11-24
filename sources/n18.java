// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;

/* compiled from: r8-map-id-6bb0649393f139a89c1ef253affcee855fb4d3290144b28c0a11ada2afdaaead */
/* loaded from: classes2.dex */
public final class n18 implements v18 {
    public final /* synthetic */ p a;

    public n18(p pVar) {
        this.a = pVar;
    }

    @Override // v18
    public final void a(TL_account.Password password) {
        this.a.b0 = password;
    }

    @Override // v18
    public final void b() {
        this.a.g0 = null;
    }

    @Override // v18
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        p pVar = this.a;
        v18 v18Var = pVar.U;
        if (v18Var != null) {
            v18Var.c(str, str2, z, tL_inputPaymentCredentialsGooglePay, tL_paymentSavedCredentialsCard);
        }
        if (pVar.T0) {
            pVar.removeSelfFromStack();
        }
        return pVar.U != null;
    }

    @Override // v18
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
    }
}
