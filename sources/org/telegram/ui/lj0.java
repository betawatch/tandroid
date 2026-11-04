package org.telegram.ui;

import org.telegram.messenger.Utilities;
import org.telegram.messenger.beta.R;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class lj0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ mj0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ lj0(mj0 mj0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = mj0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                mj0 mj0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                yj0 yj0Var = mj0Var.e;
                if (tLObject instanceof Vector) {
                    yj0Var.E = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i3 = 0; i3 < size; i3++) {
                        yj0Var.E.values.add((TLRPC.TL_secureValue) vector.objects.get(i3));
                    }
                    mj0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.t4.w0(yj0Var.getParentActivity(), org.telegram.messenger.bd.M0(2131743830, null), true);
                    } else {
                        yj0Var.Q1(org.telegram.messenger.bd.M0(R.string.AppName, null), tL_error.text);
                    }
                    yj0Var.R1(true, false);
                    break;
                }
            case 1:
                mj0 mj0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    mj0Var2.e.K = password;
                    TwoStepVerificationActivity.r0(password);
                    mj0Var2.b();
                    break;
                } else {
                    mj0Var2.getClass();
                    break;
                }
            default:
                mj0 mj0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    mj0Var3.e.K = password2;
                    TwoStepVerificationActivity.r0(password2);
                    Utilities.e.c(new hc0(mj0Var3, mj0Var3.b, mj0Var3.d, 15));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ lj0(mj0 mj0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i3) {
        this.a = i3;
        this.b = mj0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
