package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ dl0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ gk0(dl0 dl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3) {
        this.a = i3;
        this.b = dl0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i3 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        dl0 dl0Var = this.b;
        switch (i3) {
            case 0:
                dl0Var.f0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    dl0Var.b0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.t4.w0(dl0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = dl0Var.D0;
                        if (paymentForm != null && dl0Var.b0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            dl0Var.Q0();
                        }
                        TwoStepVerificationActivity.r0(dl0Var.b0);
                        dl0 dl0Var2 = dl0Var.g0;
                        if (dl0Var2 != null) {
                            dl0Var2.I0(dl0Var.b0);
                        }
                        if (!dl0Var.b0.has_password && dl0Var.e0 == null) {
                            ek0 ek0Var = new ek0(dl0Var, 2);
                            dl0Var.e0 = ek0Var;
                            org.telegram.messenger.g0.i3(ek0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                dl0.a0(dl0Var, tL_error, tLObject);
                break;
            default:
                dl0.c0(dl0Var, tL_error, tLObject);
                break;
        }
    }
}
