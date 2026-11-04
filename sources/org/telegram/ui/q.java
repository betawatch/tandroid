package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements org.telegram.messenger.u10 {
    public final /* synthetic */ int a;
    public final /* synthetic */ i4 b;

    public /* synthetic */ q(i4 i4Var, int i3) {
        this.a = i3;
        this.b = i4Var;
    }

    @Override // org.telegram.messenger.u10
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                i4 i4Var = this.b;
                ai.d2 d2Var = i4Var.r0;
                float f10 = -((Integer) obj).intValue();
                i4Var.q0 = f10;
                d2Var.setTranslationY(((1.0f - i4Var.a1) * org.telegram.messenger.g0.L(51.0f)) + f10);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    i4 i4Var2 = this.b;
                    i4Var2.i0.c0.setText(str);
                    ci.s sVar = i4Var2.i0.c0;
                    sVar.setSelection(sVar.getText().length());
                    org.telegram.messenger.g0.K3(i4Var2.i0.c0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                i4 i4Var3 = this.b;
                if (i4Var3.M != null && str2 != null) {
                    i4Var3.i0.k(false);
                    if (!sf.c.g(Uri.parse(str2), false, null)) {
                        if (!sf.c.m(i4Var3.M, str2, false)) {
                            l3 l3Var = i4Var3.v0[0];
                            if (l3Var != null && l3Var.getWebView() != null) {
                                i4Var3.v0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                sf.c.o(str2);
                                break;
                            }
                        }
                    } else {
                        u3 u3Var = i4Var3.L;
                        if (u3Var != null) {
                            u3Var.a(true);
                        }
                        sf.c.l(i4Var3.M, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) obj;
                i4 i4Var4 = this.b;
                if (i4Var4.M != null && x0Var != null) {
                    i4Var4.i0.k(false);
                    l3 l3Var2 = i4Var4.v0[0];
                    if (l3Var2 != null && l3Var2.getWebView() != null) {
                        i4Var4.v0[0].getWebView().e(x0Var.c, x0Var.d);
                        break;
                    } else {
                        sf.c.o(x0Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
