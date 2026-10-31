package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ o1(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                r1 r1Var = (r1) this.b;
                h4 h4Var = r1Var.y;
                if (h4Var.O != null) {
                    h4Var.P.setVisibility(4);
                    h4 h4Var2 = r1Var.y;
                    h4Var2.P.removeView(h4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = r1Var.y.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        r1Var.y.S.onCustomViewHidden();
                    }
                    r1Var.y.O = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.hu huVar = (org.telegram.ui.Components.hu) this.b;
                if (huVar.k1 != null) {
                    huVar.b.setVisibility(0);
                    huVar.l1.setVisibility(4);
                    huVar.l1.removeView(huVar.k1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = huVar.m1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        huVar.m1.onCustomViewHidden();
                    }
                    huVar.k1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i10, WebChromeClient.CustomViewCallback customViewCallback) {
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
                h4 h4Var = ((r1) this.b).y;
                if (h4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    h4Var.O = view;
                    h4Var.S = customViewCallback;
                    org.telegram.messenger.i0.h3(new rr0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.hu huVar = (org.telegram.ui.Components.hu) this.b;
                FrameLayout frameLayout = huVar.l1;
                if (huVar.k1 == null && !org.telegram.ui.Components.jf0.p0.P) {
                    huVar.J0();
                    huVar.k1 = view;
                    huVar.b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.b6.c(-1.0f, -1));
                    huVar.m1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
