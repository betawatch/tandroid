package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final /* synthetic */ class im0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ im0(jm0 jm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = jm0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                jm0 jm0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                wm0 wm0Var = jm0Var.e;
                if (tLObject instanceof Vector) {
                    wm0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i9 = 0; i9 < size; i9++) {
                        wm0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i9));
                    }
                    jm0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.y4.x0(wm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        wm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    wm0Var.N1(true, false);
                    break;
                }
            case 1:
                jm0 jm0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    jm0Var2.e.F = password;
                    TwoStepVerificationActivity.l0(password);
                    jm0Var2.b();
                    break;
                } else {
                    jm0Var2.getClass();
                    break;
                }
            default:
                jm0 jm0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    jm0Var3.e.F = password2;
                    TwoStepVerificationActivity.l0(password2);
                    Utilities.globalQueue.postRunnable(new ye0(jm0Var3, jm0Var3.b, jm0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ im0(jm0 jm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i9) {
        this.a = i9;
        this.b = jm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
