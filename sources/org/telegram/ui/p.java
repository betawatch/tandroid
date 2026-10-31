package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements org.telegram.messenger.q20 {
    public final /* synthetic */ int a;
    public final /* synthetic */ h4 b;

    public /* synthetic */ p(h4 h4Var, int i10) {
        this.a = i10;
        this.b = h4Var;
    }

    @Override // org.telegram.messenger.q20
    public final void a(Object obj) {
        switch (this.a) {
            case 0:
                h4 h4Var = this.b;
                org.telegram.ui.Cells.a5 a5Var = h4Var.q0;
                float f7 = -((Integer) obj).intValue();
                h4Var.p0 = f7;
                a5Var.setTranslationY(((1.0f - h4Var.Z0) * org.telegram.messenger.i0.L(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    h4 h4Var2 = this.b;
                    h4Var2.h0.b0.setText(str);
                    zd zdVar = h4Var2.h0.b0;
                    zdVar.setSelection(zdVar.getText().length());
                    org.telegram.messenger.i0.J3(h4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                h4 h4Var3 = this.b;
                if (h4Var3.L != null && str2 != null) {
                    h4Var3.h0.k(false);
                    if (!gf.f.e(Uri.parse(str2), false, null)) {
                        if (!gf.f.k(h4Var3.L, str2, false)) {
                            l3 l3Var = h4Var3.u0[0];
                            if (l3Var != null && l3Var.getWebView() != null) {
                                h4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                gf.f.m(str2);
                                break;
                            }
                        }
                    } else {
                        u3 u3Var = h4Var3.K;
                        if (u3Var != null) {
                            u3Var.a(true);
                        }
                        gf.f.j(h4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.a1 a1Var = (org.telegram.ui.web.a1) obj;
                h4 h4Var4 = this.b;
                if (h4Var4.L != null && a1Var != null) {
                    h4Var4.h0.k(false);
                    l3 l3Var2 = h4Var4.u0[0];
                    if (l3Var2 != null && l3Var2.getWebView() != null) {
                        h4Var4.u0[0].getWebView().e(a1Var.c, a1Var.d);
                        break;
                    } else {
                        gf.f.m(a1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
