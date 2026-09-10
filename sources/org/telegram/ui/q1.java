package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
                j4 j4Var = u1Var.x;
                if (j4Var.O != null) {
                    j4Var.P.setVisibility(4);
                    j4 j4Var2 = u1Var.x;
                    j4Var2.P.removeView(j4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = u1Var.x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        u1Var.x.S.onCustomViewHidden();
                    }
                    u1Var.x.O = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) this.b;
                if (zuVar.d != null) {
                    zuVar.getSheetContainer().setVisibility(0);
                    zuVar.e.setVisibility(4);
                    zuVar.e.removeView(zuVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = zuVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        zuVar.f.onCustomViewHidden();
                    }
                    zuVar.d = null;
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
                j4 j4Var = ((u1) this.b).x;
                if (j4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    j4Var.O = view;
                    j4Var.S = customViewCallback;
                    AndroidUtilities.runOnUIThread(new mu0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.zu zuVar = (org.telegram.ui.Components.zu) this.b;
                FrameLayout frameLayout = zuVar.e;
                if (zuVar.d == null && !org.telegram.ui.Components.og0.p0.P) {
                    zuVar.I();
                    zuVar.d = view;
                    zuVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.a6.c(-1.0f, -1));
                    zuVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
