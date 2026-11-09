package org.telegram.ui;

import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class mk0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jl0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ mk0(jl0 jl0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = jl0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i7 = this.a;
        TLObject tLObject = this.d;
        TLRPC.TL_error tL_error = this.c;
        jl0 jl0Var = this.b;
        switch (i7) {
            case 0:
                jl0Var.e0 = false;
                if (tL_error == null) {
                    TL_account.Password password = (TL_account.Password) tLObject;
                    jl0Var.a0 = password;
                    if (!TwoStepVerificationActivity.n0(password, false)) {
                        org.telegram.ui.Components.v4.u0(jl0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743820, null), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = jl0Var.C0;
                        if (paymentForm != null && jl0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            jl0Var.Q0();
                        }
                        TwoStepVerificationActivity.r0(jl0Var.a0);
                        jl0 jl0Var2 = jl0Var.f0;
                        if (jl0Var2 != null) {
                            jl0Var2.I0(jl0Var.a0);
                        }
                        if (!jl0Var.a0.has_password && jl0Var.d0 == null) {
                            kk0 kk0Var = new kk0(jl0Var, 2);
                            jl0Var.d0 = kk0Var;
                            org.telegram.messenger.g0.i3(kk0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                jl0.a0(jl0Var, tL_error, tLObject);
                break;
            default:
                jl0.c0(jl0Var, tL_error, tLObject);
                break;
        }
    }
}
