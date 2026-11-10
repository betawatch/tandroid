package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
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
                if (g4Var.O != null) {
                    g4Var.P.setVisibility(4);
                    g4 g4Var2 = q1Var.y;
                    g4Var2.P.removeView(g4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = q1Var.y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        q1Var.y.S.onCustomViewHidden();
                    }
                    q1Var.y.O = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) this.b;
                if (vtVar.n1 != null) {
                    vtVar.b.setVisibility(0);
                    vtVar.o1.setVisibility(4);
                    vtVar.o1.removeView(vtVar.n1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = vtVar.p1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        vtVar.p1.onCustomViewHidden();
                    }
                    vtVar.n1 = null;
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
                if (g4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    g4Var.O = view;
                    g4Var.S = customViewCallback;
                    org.telegram.messenger.g0.i3(new jq0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.vt vtVar = (org.telegram.ui.Components.vt) this.b;
                if (vtVar.n1 == null && !vtVar.M0()) {
                    vtVar.L0();
                    vtVar.n1 = view;
                    vtVar.b.setVisibility(4);
                    vtVar.o1.setVisibility(0);
                    vtVar.o1.addView(view, c8.ha.c(-1.0f, -1));
                    vtVar.p1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
