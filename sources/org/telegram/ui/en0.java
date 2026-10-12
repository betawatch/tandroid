package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final /* synthetic */ class en0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ fn0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ en0(fn0 fn0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = fn0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                fn0 fn0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                un0 un0Var = fn0Var.e;
                if (tLObject instanceof Vector) {
                    un0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        un0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    fn0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.g5.w0(un0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        un0Var.L1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    un0Var.M1(true, false);
                    break;
                }
            case 1:
                fn0 fn0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    fn0Var2.e.J = password;
                    TwoStepVerificationActivity.m0(password);
                    fn0Var2.b();
                    break;
                } else {
                    fn0Var2.getClass();
                    break;
                }
            default:
                fn0 fn0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    fn0Var3.e.J = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new uf0(fn0Var3, fn0Var3.b, fn0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ en0(fn0 fn0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = fn0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
