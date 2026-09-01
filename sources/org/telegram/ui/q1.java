package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class q1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ q1(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                u1 u1Var = (u1) this.b;
                l4 l4Var = u1Var.x;
                if (l4Var.L != null) {
                    l4Var.M.setVisibility(4);
                    l4 l4Var2 = u1Var.x;
                    l4Var2.M.removeView(l4Var2.L);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.x.P;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.x.P.onCustomViewHidden();
                    }
                    u1Var.x.L = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.b;
                if (ruVar.d != null) {
                    ruVar.getSheetContainer().setVisibility(0);
                    ruVar.e.setVisibility(4);
                    ruVar.e.removeView(ruVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = ruVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        ruVar.f.onCustomViewHidden();
                    }
                    ruVar.d = null;
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
                l4 l4Var = ((u1) this.b).x;
                if (l4Var.L != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    l4Var.L = view;
                    l4Var.P = customViewCallback;
                    AndroidUtilities.runOnUIThread(new tt0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.ru ruVar = (org.telegram.ui.Components.ru) this.b;
                FrameLayout frameLayout = ruVar.e;
                if (ruVar.d == null && !org.telegram.ui.Components.ng0.m0.M) {
                    ruVar.H();
                    ruVar.d = view;
                    ruVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, k7.c6.c(-1.0f, -1));
                    ruVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
