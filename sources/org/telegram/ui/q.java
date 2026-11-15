package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.messenger.z10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ q(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // org.telegram.messenger.z10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                bi.v1 v1Var = g4Var.r0;
                float f10 = -((Integer) obj).intValue();
                g4Var.q0 = f10;
                v1Var.setTranslationY(((1.0f - g4Var.a1) * org.telegram.messenger.g0.L(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    g4 g4Var2 = this.b;
                    g4Var2.i0.c0.setText(str);
                    di.q qVar = g4Var2.i0.c0;
                    qVar.setSelection(qVar.getText().length());
                    org.telegram.messenger.g0.J3(g4Var2.i0.c0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                g4 g4Var3 = this.b;
                if (g4Var3.M != null && str2 != null) {
                    g4Var3.i0.k(false);
                    if (!vf.c.g(Uri.parse(str2), false, null)) {
                        if (!vf.c.m(g4Var3.M, str2, false)) {
                            k3 k3Var = g4Var3.v0[0];
                            if (k3Var != null && k3Var.getWebView() != null) {
                                g4Var3.v0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                vf.c.o(str2);
                                break;
                            }
                        }
                    } else {
                        t3 t3Var = g4Var3.L;
                        if (t3Var != null) {
                            t3Var.a(true);
                        }
                        vf.c.l(g4Var3.M, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) obj;
                g4 g4Var4 = this.b;
                if (g4Var4.M != null && w0Var != null) {
                    g4Var4.i0.k(false);
                    k3 k3Var2 = g4Var4.v0[0];
                    if (k3Var2 != null && k3Var2.getWebView() != null) {
                        g4Var4.v0[0].getWebView().e(w0Var.c, w0Var.d);
                        break;
                    } else {
                        vf.c.o(w0Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
