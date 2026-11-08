package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
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
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) this.b;
                if (wtVar.k1 != null) {
                    wtVar.b.setVisibility(0);
                    wtVar.l1.setVisibility(4);
                    wtVar.l1.removeView(wtVar.k1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = wtVar.m1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        wtVar.m1.onCustomViewHidden();
                    }
                    wtVar.k1 = null;
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
                    org.telegram.messenger.g0.i3(new gq0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.wt wtVar = (org.telegram.ui.Components.wt) this.b;
                if (wtVar.k1 == null && !wtVar.M0()) {
                    wtVar.L0();
                    wtVar.k1 = view;
                    wtVar.b.setVisibility(4);
                    wtVar.l1.setVisibility(0);
                    wtVar.l1.addView(view, c8.ha.c(-1.0f, -1));
                    wtVar.m1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
