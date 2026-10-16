package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final /* synthetic */ class dn0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ en0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ dn0(en0 en0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = en0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                en0 en0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                sn0 sn0Var = en0Var.e;
                if (tLObject instanceof Vector) {
                    sn0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        sn0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    en0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.g5.w0(sn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        sn0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    sn0Var.M1(true, false);
                    break;
                }
            case 1:
                en0 en0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    en0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    en0Var2.b();
                    break;
                } else {
                    en0Var2.getClass();
                    break;
                }
            default:
                en0 en0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    en0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new tf0(en0Var3, en0Var3.b, en0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ dn0(en0 en0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = en0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
