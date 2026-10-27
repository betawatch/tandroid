package org.telegram.ui;

import android.net.Uri;
import android.text.TextUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final /* synthetic */ class q implements Utilities.Callback {
    public final /* synthetic */ int a;
    public final /* synthetic */ j4 b;

    public /* synthetic */ q(j4 j4Var, int i10) {
        this.a = i10;
        this.b = j4Var;
    }

    @Override // org.telegram.messenger.Utilities.Callback
    public final void run(Object obj) {
        switch (this.a) {
            case 0:
                j4 j4Var = this.b;
                di.i4 i4Var = j4Var.q0;
                float f7 = -((Integer) obj).intValue();
                j4Var.p0 = f7;
                i4Var.setTranslationY(((1.0f - j4Var.Z0) * AndroidUtilities.dp(51.0f)) + f7);
                break;
            case 1:
                String str = (String) obj;
                if (!TextUtils.isEmpty(str)) {
                    j4 j4Var2 = this.b;
                    j4Var2.h0.b0.setText(str);
                    bi.t tVar = j4Var2.h0.b0;
                    tVar.setSelection(tVar.getText().length());
                    AndroidUtilities.showKeyboard(j4Var2.h0.b0);
                    break;
                }
                break;
            case 2:
                String str2 = (String) obj;
                j4 j4Var3 = this.b;
                if (j4Var3.L != null && str2 != null) {
                    j4Var3.h0.k(false);
                    if (!qf.d.e(Uri.parse(str2), false, null)) {
                        if (!qf.d.k(j4Var3.L, str2, false)) {
                            m3 m3Var = j4Var3.u0[0];
                            if (m3Var != null && m3Var.getWebView() != null) {
                                j4Var3.u0[0].getWebView().loadUrl(str2);
                                break;
                            } else {
                                qf.d.m(str2);
                                break;
                            }
                        }
                    } else {
                        v3 v3Var = j4Var3.K;
                        if (v3Var != null) {
                            v3Var.dismiss(true);
                        }
                        qf.d.j(j4Var3.L, str2, false, false, null);
                        break;
                    }
                }
                break;
            default:
                org.telegram.ui.web.b1 b1Var = (org.telegram.ui.web.b1) obj;
                j4 j4Var4 = this.b;
                if (j4Var4.L != null && b1Var != null) {
                    j4Var4.h0.k(false);
                    m3 m3Var2 = j4Var4.u0[0];
                    if (m3Var2 != null && m3Var2.getWebView() != null) {
                        j4Var4.u0[0].getWebView().e(b1Var.c, b1Var.d);
                        break;
                    } else {
                        qf.d.m(b1Var.c);
                        break;
                    }
                }
                break;
        }
    }
}
