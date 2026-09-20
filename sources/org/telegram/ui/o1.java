package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
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
                s1 s1Var = (s1) this.b;
                h4 h4Var = s1Var.x;
                if (h4Var.O != null) {
                    h4Var.P.setVisibility(4);
                    h4 h4Var2 = s1Var.x;
                    h4Var2.P.removeView(h4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = s1Var.x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        s1Var.x.S.onCustomViewHidden();
                    }
                    s1Var.x.O = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.vu vuVar = (org.telegram.ui.Components.vu) this.b;
                if (vuVar.d != null) {
                    vuVar.getSheetContainer().setVisibility(0);
                    vuVar.e.setVisibility(4);
                    vuVar.e.removeView(vuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = vuVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        vuVar.f.onCustomViewHidden();
                    }
                    vuVar.d = null;
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
                h4 h4Var = ((s1) this.b).x;
                if (h4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    h4Var.O = view;
                    h4Var.S = customViewCallback;
                    AndroidUtilities.runOnUIThread(new mu0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.vu vuVar = (org.telegram.ui.Components.vu) this.b;
                FrameLayout frameLayout = vuVar.e;
                if (vuVar.d == null && !org.telegram.ui.Components.og0.p0.P) {
                    vuVar.I();
                    vuVar.d = view;
                    vuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.y5.c(-1.0f, -1));
                    vuVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
