package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.messenger.c20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ g4 b;

    public /* synthetic */ q(g4 g4Var, int i7) {
        this.a = i7;
        this.b = g4Var;
    }

    @Override // org.telegram.messenger.c20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                g4 g4Var = this.b;
                di.a4 a4Var = g4Var.q0;
                float f10 = -((Integer) obj).intValue();
                g4Var.p0 = f10;
                a4Var.setTranslationY(((1.0f - g4Var.Z0) * org.telegram.messenger.g0.L(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    g4 g4Var2 = this.b;
                    g4Var2.h0.b0.setText(str);
                    bi.v vVar = g4Var2.h0.b0;
                    vVar.setSelection(vVar.getText().length());
                    org.telegram.messenger.g0.K3(g4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                g4 g4Var3 = this.b;
                if (g4Var3.L != null && str2 != null) {
                    g4Var3.h0.k(false);
                    if (!vf.c.g(Uri.parse(str2), false, null)) {
                        if (!vf.c.m(g4Var3.L, str2, false)) {
                            k3 k3Var = g4Var3.u0[0];
                            if (k3Var != null && k3Var.getWebView() != null) {
                                g4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                vf.c.o(str2);
                                break;
                            }
                        }
                    } else {
                        t3 t3Var = g4Var3.K;
                        if (t3Var != null) {
                            t3Var.a(true);
                        }
                        vf.c.l(g4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) obj;
                g4 g4Var4 = this.b;
                if (g4Var4.L != null && y0Var != null) {
                    g4Var4.h0.k(false);
                    k3 k3Var2 = g4Var4.u0[0];
                    if (k3Var2 != null && k3Var2.getWebView() != null) {
                        g4Var4.u0[0].getWebView().e(y0Var.c, y0Var.d);
                        break;
                    } else {
                        vf.c.o(y0Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
