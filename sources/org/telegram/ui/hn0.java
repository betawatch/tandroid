package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class hn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ io0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ hn0(io0 io0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = io0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                io0 io0Var = this.b;
                io0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    io0Var.a0 = password;
                    if (!TwoStepVerificationActivity.i0(password, false)) {
                        org.telegram.ui.Components.f5.x0(io0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = io0Var.C0;
                        if (paymentForm != null && io0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            io0Var.K0();
                        }
                        TwoStepVerificationActivity.m0(io0Var.a0);
                        io0 io0Var2 = io0Var.f0;
                        if (io0Var2 != null) {
                            io0Var2.C0(io0Var.a0);
                        }
                        if (!io0Var.a0.has_password && io0Var.d0 == null) {
                            fn0 fn0Var = new fn0(io0Var, 3);
                            io0Var.d0 = fn0Var;
                            AndroidUtilities.runOnUIThread(fn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                io0.V(this.b, this.c, this.d);
                break;
            default:
                io0.X(this.b, this.c, this.d);
                break;
        }
    }
}
