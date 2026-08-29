package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ gm0(hm0 hm0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = hm0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                hm0 hm0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                vm0 vm0Var = hm0Var.e;
                if (tLObject instanceof Vector) {
                    vm0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        vm0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    hm0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.c5.x0(vm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        vm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    vm0Var.N1(true, false);
                    break;
                }
            case 1:
                hm0 hm0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    hm0Var2.e.F = password;
                    TwoStepVerificationActivity.m0(password);
                    hm0Var2.b();
                    break;
                } else {
                    hm0Var2.getClass();
                    break;
                }
            default:
                hm0 hm0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    hm0Var3.e.F = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new xe0(hm0Var3, hm0Var3.b, hm0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ gm0(hm0 hm0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = hm0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
