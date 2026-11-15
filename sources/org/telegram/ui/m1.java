package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                org.telegram.ui.Components.bu buVar = (org.telegram.ui.Components.bu) this.b;
                if (buVar.o1 != null) {
                    buVar.b.setVisibility(0);
                    buVar.p1.setVisibility(4);
                    buVar.p1.removeView(buVar.o1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = buVar.q1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        buVar.q1.onCustomViewHidden();
                    }
                    buVar.o1 = null;
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
                    org.telegram.messenger.g0.i3(new fq0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.bu buVar = (org.telegram.ui.Components.bu) this.b;
                if (buVar.o1 == null && !buVar.M0()) {
                    buVar.L0();
                    buVar.o1 = view;
                    buVar.b.setVisibility(4);
                    buVar.p1.setVisibility(0);
                    buVar.p1.addView(view, c8.ja.c(-1.0f, -1));
                    buVar.q1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
