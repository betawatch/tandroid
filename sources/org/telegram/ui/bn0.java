package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final /* synthetic */ class bn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ cn0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ bn0(cn0 cn0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = cn0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                cn0 cn0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                qn0 qn0Var = cn0Var.e;
                if (tLObject instanceof Vector) {
                    qn0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        qn0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    cn0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.c5.x0(qn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        qn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    qn0Var.N1(true, false);
                    break;
                }
            case 1:
                cn0 cn0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    cn0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    cn0Var2.b();
                    break;
                } else {
                    cn0Var2.getClass();
                    break;
                }
            default:
                cn0 cn0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    cn0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new rf0(cn0Var3, cn0Var3.b, cn0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ bn0(cn0 cn0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = cn0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
