package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class n1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ n1(KeyEvent.Callback callback, int i3) {
        this.a = i3;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                r1 r1Var = (r1) this.b;
                i4 i4Var = r1Var.y;
                if (i4Var.P != null) {
                    i4Var.Q.setVisibility(4);
                    i4 i4Var2 = r1Var.y;
                    i4Var2.Q.removeView(i4Var2.P);
                    WebChromeClient.CustomViewCallback customViewCallback = r1Var.y.T;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        r1Var.y.T.onCustomViewHidden();
                    }
                    r1Var.y.P = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) this.b;
                if (utVar.l1 != null) {
                    utVar.b.setVisibility(0);
                    utVar.m1.setVisibility(4);
                    utVar.m1.removeView(utVar.l1);
                    WebChromeClient.CustomViewCallback customViewCallback2 = utVar.n1;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        utVar.n1.onCustomViewHidden();
                    }
                    utVar.l1 = null;
                    break;
                }
                break;
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i3, WebChromeClient.CustomViewCallback customViewCallback) {
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
                i4 i4Var = ((r1) this.b).y;
                if (i4Var.P != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    i4Var.P = view;
                    i4Var.T = customViewCallback;
                    org.telegram.messenger.g0.i3(new xp0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.ut utVar = (org.telegram.ui.Components.ut) this.b;
                FrameLayout frameLayout = utVar.m1;
                if (utVar.l1 == null && !org.telegram.ui.Components.ie0.q0.Q) {
                    utVar.J0();
                    utVar.l1 = view;
                    utVar.b.setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, b8.mf.c(-1.0f, -1));
                    utVar.n1 = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
