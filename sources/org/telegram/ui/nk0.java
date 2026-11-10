package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class nk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ kl0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ nk0(kl0 kl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = kl0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        kl0 kl0Var = this.b;
        switch (i7) {
            case 0:
                kl0Var.e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    kl0Var.a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.u4.u0(kl0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = kl0Var.C0;
                        if (paymentForm != null && kl0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            kl0Var.Q0();
                        }
                        TwoStepVerificationActivity.r0(kl0Var.a0);
                        kl0 kl0Var2 = kl0Var.f0;
                        if (kl0Var2 != null) {
                            kl0Var2.I0(kl0Var.a0);
                        }
                        if (!kl0Var.a0.has_password && kl0Var.d0 == null) {
                            lk0 lk0Var = new lk0(kl0Var, 2);
                            kl0Var.d0 = lk0Var;
                            org.telegram.messenger.g0.i3(lk0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                kl0.a0(kl0Var, tL_error, tLObject);
                break;
            default:
                kl0.c0(kl0Var, tL_error, tLObject);
                break;
        }
    }
}
