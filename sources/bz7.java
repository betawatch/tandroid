// default package

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.p;

/* compiled from: r8-map-id-951793a810ac989768404cff61e59f80982ec4abf68731718853a39916547cc3 */
/* loaded from: classes2.dex */
public final class bz7 implements sz7 {
    public final /* synthetic */ p a;

    public bz7(p pVar) {
        this.a = pVar;
    }

    @Override // sz7
    public final boolean c(String str, String str2, boolean z, TLRPC.TL_inputPaymentCredentialsGooglePay tL_inputPaymentCredentialsGooglePay, TLRPC.TL_paymentSavedCredentialsCard tL_paymentSavedCredentialsCard) {
        return false;
    }

    @Override // sz7
    public final void d(TLRPC.TL_payments_validateRequestedInfo tL_payments_validateRequestedInfo) {
        p pVar = this.a;
        pVar.J0 = tL_payments_validateRequestedInfo;
        pVar.G0(tL_payments_validateRequestedInfo.info);
    }

    @Override // sz7
    public final void b() {
    }

    @Override // sz7
    public final void a(TL_account.Password password) {
    }
}
