package org.telegram.ui;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ po0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ pn0(po0 po0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = po0Var;
        this.c = tL_error;
        this.d = tLObject;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                po0 po0Var = this.b;
                po0Var.e0 = false;
                if (this.c == null) {
                    TL_account.Password password = (TL_account.Password) this.d;
                    po0Var.a0 = password;
                    if (!TwoStepVerificationActivity.j0(password, false)) {
                        org.telegram.ui.Components.g5.w0(po0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                        break;
                    } else {
                        TLRPC.PaymentForm paymentForm = po0Var.C0;
                        if (paymentForm != null && po0Var.a0.has_password) {
                            paymentForm.password_missing = false;
                            paymentForm.can_save_credentials = true;
                            po0Var.L0();
                        }
                        TwoStepVerificationActivity.n0(po0Var.a0);
                        po0 po0Var2 = po0Var.f0;
                        if (po0Var2 != null) {
                            po0Var2.D0(po0Var.a0);
                        }
                        if (!po0Var.a0.has_password && po0Var.d0 == null) {
                            nn0 nn0Var = new nn0(po0Var, 3);
                            po0Var.d0 = nn0Var;
                            AndroidUtilities.runOnUIThread(nn0Var, 5000L);
                            break;
                        }
                    }
                }
                break;
            case 1:
                po0.W(this.b, this.c, this.d);
                break;
            default:
                po0.Y(this.b, this.c, this.d);
                break;
        }
    }
}
