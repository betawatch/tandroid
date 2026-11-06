package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final /* synthetic */ class kk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hl0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ kk0(hl0 hl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = hl0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        hl0 hl0Var = this.b;
        switch (i7) {
            case 0:
                hl0Var.e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    hl0Var.a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.v4.u0(hl0Var.getParentActivity(), org.telegram.messenger.hd.M0(2131743821, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = hl0Var.C0;
                        if (paymentForm != null && hl0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            hl0Var.Q0();
                        }
                        TwoStepVerificationActivity.r0(hl0Var.a0);
                        hl0 hl0Var2 = hl0Var.f0;
                        if (hl0Var2 != null) {
                            hl0Var2.I0(hl0Var.a0);
                        }
                        if (!hl0Var.a0.has_password && hl0Var.d0 == null) {
                            ik0 ik0Var = new ik0(hl0Var, 2);
                            hl0Var.d0 = ik0Var;
                            org.telegram.messenger.g0.i3(ik0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                hl0.a0(hl0Var, tL_error, tLObject);
                break;
            default:
                hl0.c0(hl0Var, tL_error, tLObject);
                break;
        }
    }
}
