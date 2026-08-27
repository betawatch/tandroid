package org.telegram.ui;

import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final /* synthetic */ class jm0 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ km0 b;
    public final /* synthetic */ TLRPC.TL_error c;
    public final /* synthetic */ TLObject d;

    public /* synthetic */ jm0(km0 km0Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.a = 0;
        this.b = km0Var;
        this.d = tLObject;
        this.c = tL_error;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                km0 km0Var = this.b;
                TLObject tLObject = this.d;
                TLRPC.TL_error tL_error = this.c;
                xm0 xm0Var = km0Var.e;
                if (tLObject instanceof Vector) {
                    xm0Var.y = new TL_account.authorizationForm();
                    Vector vector = (Vector) tLObject;
                    int size = vector.objects.size();
                    for (int i10 = 0; i10 < size; i10++) {
                        xm0Var.y.values.add((TLRPC.TL_secureValue) vector.objects.get(i10));
                    }
                    km0Var.a();
                    break;
                } else {
                    if ("APP_VERSION_OUTDATED".equals(tL_error.text)) {
                        org.telegram.ui.Components.y4.x0(xm0Var.getParentActivity(), LocaleController.getString(R.string.UpdateAppAlert), true);
                    } else {
                        xm0Var.M1(LocaleController.getString(R.string.AppName), tL_error.text);
                    }
                    xm0Var.N1(true, false);
                    break;
                }
            case 1:
                km0 km0Var2 = this.b;
                TLRPC.TL_error tL_error2 = this.c;
                TLObject tLObject2 = this.d;
                if (tL_error2 == null) {
                    TL_account.Password password = (TL_account.Password) tLObject2;
                    km0Var2.e.F = password;
                    TwoStepVerificationActivity.m0(password);
                    km0Var2.b();
                    break;
                } else {
                    km0Var2.getClass();
                    break;
                }
            default:
                km0 km0Var3 = this.b;
                TLRPC.TL_error tL_error3 = this.c;
                TLObject tLObject3 = this.d;
                if (tL_error3 == null) {
                    TL_account.Password password2 = (TL_account.Password) tLObject3;
                    km0Var3.e.F = password2;
                    TwoStepVerificationActivity.m0(password2);
                    Utilities.globalQueue.postRunnable(new bf0(km0Var3, km0Var3.b, km0Var3.d, 12));
                    break;
                }
                break;
        }
    }

    public /* synthetic */ jm0(km0 km0Var, TLRPC.TL_error tL_error, TLObject tLObject, int i10) {
        this.a = i10;
        this.b = km0Var;
        this.c = tL_error;
        this.d = tLObject;
    }
}
