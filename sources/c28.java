// default package

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.p;

/* compiled from: r8-map-id-5e1f6e728e9d22ac16682c089d8aff8b7fbbe935d58f90b537e0237d8c520d54 */
/* loaded from: classes2.dex */
public final /* synthetic */ class c28 implements Runnable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ p b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ c28(p pVar, TLRPC.TL_error tL_error, TLObject tLObject, byte b) {
        this.a = b;
        this.b = pVar;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        p pVar = this.b;
        switch (b) {
            case 0:
                pVar.f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    pVar.b0 = password;
                    byte b2 = 1;
                    if (!TwoStepVerificationActivity.a0(password, false)) {
                        jj.u0(pVar.getParentActivity(), ob6.M0(2131743475, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = pVar.D0;
                        if (paymentForm != null && pVar.b0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            pVar.Q0();
                        }
                        TwoStepVerificationActivity.e0(pVar.b0);
                        p pVar2 = pVar.g0;
                        if (pVar2 != null) {
                            pVar2.I0(pVar.b0);
                        }
                        if (!pVar.b0.has_password && pVar.e0 == null) {
                            x18 x18Var = new x18(pVar, b2);
                            pVar.e0 = x18Var;
                            hl.d3(x18Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                pVar.w0(tLObject, tL_error);
                break;
            default:
                pVar.z0(tLObject, tL_error);
                break;
        }
    }
}
