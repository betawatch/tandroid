package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final /* synthetic */ class om0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ pm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ om0(pm0 pm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = pm0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                pm0 pm0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                dn0 dn0Var = pm0Var.e;
                if (tLObject instanceof Vector) {
                    dn0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        dn0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    pm0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.z4.x0(dn0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        dn0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    dn0Var.N1(true, false);
                    break;
                }
            case 1:
                pm0 pm0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    pm0Var2.e.G = password;
                    TwoStepVerificationActivity.m0(password);
                    pm0Var2.b();
                    break;
                } else {
                    pm0Var2.getClass();
                    break;
                }
            default:
                pm0 pm0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    pm0Var3.e.G = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new hf0(pm0Var3, pm0Var3.b, pm0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ om0(pm0 pm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = pm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
