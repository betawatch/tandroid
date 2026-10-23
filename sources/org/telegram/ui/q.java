package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ k4 b;

    public /* synthetic */ q(k4 k4Var, int i10) {
        this.a = i10;
        this.b = k4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                k4 k4Var = this.b;
                ci.h4 h4Var = k4Var.q0;
                float f7 = -((Integer) obj).intValue();
                k4Var.p0 = f7;
                h4Var.setTranslationY(((1.0f - k4Var.Z0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    k4 k4Var2 = this.b;
                    k4Var2.h0.b0.setText(str);
                    ai.t tVar = k4Var2.h0.b0;
                    tVar.setSelection(tVar.getText().length());
                    AndroidUtilities.showKeyboard(k4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                k4 k4Var3 = this.b;
                if (k4Var3.L != null && str2 != null) {
                    k4Var3.h0.k(false);
                    if (!pf.d.e(Uri.parse(str2), false, null)) {
                        if (!pf.d.k(k4Var3.L, str2, false)) {
                            n3 n3Var = k4Var3.u0[0];
                            if (n3Var != null && n3Var.getWebView() != null) {
                                k4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                pf.d.m(str2);
                                break;
                            }
                        }
                    } else {
                        w3 w3Var = k4Var3.K;
                        if (w3Var != null) {
                            w3Var.dismiss(true);
                        }
                        pf.d.j(k4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.c1 c1Var = (org.telegram.ui.web.c1) obj;
                k4 k4Var4 = this.b;
                if (k4Var4.L != null && c1Var != null) {
                    k4Var4.h0.k(false);
                    n3 n3Var2 = k4Var4.u0[0];
                    if (n3Var2 != null && n3Var2.getWebView() != null) {
                        k4Var4.u0[0].getWebView().e(c1Var.c, c1Var.d);
                        break;
                    } else {
                        pf.d.m(c1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
