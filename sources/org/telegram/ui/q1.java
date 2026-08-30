package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
                org.telegram.ui.Components.pu puVar = (org.telegram.ui.Components.pu) this.b;
                if (puVar.d != null) {
                    puVar.getSheetContainer().setVisibility(0);
                    puVar.e.setVisibility(4);
                    puVar.e.removeView(puVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = puVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        puVar.f.onCustomViewHidden();
                    }
                    puVar.d = null;
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
                    AndroidUtilities.runOnUIThread(new rt0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.pu puVar = (org.telegram.ui.Components.pu) this.b;
                FrameLayout frameLayout = puVar.e;
                if (puVar.d == null && !org.telegram.ui.Components.lg0.m0.M) {
                    puVar.H();
                    puVar.d = view;
                    puVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, k7.b6.c(-1.0f, -1));
                    puVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
