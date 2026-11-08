package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class oj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pj0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ oj0(pj0 pj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = pj0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pj0 pj0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                bk0 bk0Var = pj0Var.e;
                if (tLObject instanceof Vector) {
                    bk0Var.D = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i7 = 0; i7 < size; i7++) {
                        bk0Var.D.values.add((TLRPC.TL_secureValue) vector.objects.get(i7));
                    }
                    pj0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.v4.u0(bk0Var.getParentActivity(), org.telegram.messenger.id.M0(2131743823, null), true);
                    } else {
                        bk0Var.Q1(org.telegram.messenger.id.M0(R.string.AppName, null), tL_error.text);
                    }
                    bk0Var.R1(true, false);
                    break;
                }
            case 1:
                pj0 pj0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    pj0Var2.e.J = password;
                    TwoStepVerificationActivity.r0(password);
                    pj0Var2.b();
                    break;
                } else {
                    pj0Var2.getClass();
                    break;
                }
            default:
                pj0 pj0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    pj0Var3.e.J = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new mc0(pj0Var3, pj0Var3.b, pj0Var3.d, 14));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ oj0(pj0 pj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i7) {
        this.a = i7;
        this.b = pj0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
