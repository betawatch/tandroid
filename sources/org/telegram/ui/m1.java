package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class m1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ m1(KeyEvent.Callback callback, int i7) {
        this.a = i7;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                q1 q1Var = (q1) this.b;
                g4 g4Var = q1Var.y;
                if (g4Var.P != null) {
                    g4Var.Q.setVisibility(4);
                    g4 g4Var2 = q1Var.y;
                    g4Var2.Q.removeView(g4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.y.T.onCustomViewHidden();
                    }
                    q1Var.y.P = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) this.b;
                if (iuVar.o1 != null) {
                    iuVar.b.setVisibility(0);
                    iuVar.p1.setVisibility(4);
                    iuVar.p1.removeView(iuVar.o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = iuVar.q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        iuVar.q1.onCustomViewHidden();
                    }
                    iuVar.o1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i7, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.a) {
            case 0:
                onShowCustomView(view, customViewCallback);
                break;
            default:
                onShowCustomView(view, customViewCallback);
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        switch (this.a) {
            case 0:
                g4 g4Var = ((q1) this.b).y;
                if (g4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    g4Var.P = view;
                    g4Var.T = customViewCallback;
                    org.telegram.messenger.g0.h3(new hq0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.iu iuVar = (org.telegram.ui.Components.iu) this.b;
                if (iuVar.o1 == null && !iuVar.N0()) {
                    iuVar.M0();
                    iuVar.o1 = view;
                    iuVar.b.setVisibility(4);
                    iuVar.p1.setVisibility(0);
                    iuVar.p1.addView(view, c8.ma.c(-1.0f, -1));
                    iuVar.q1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
