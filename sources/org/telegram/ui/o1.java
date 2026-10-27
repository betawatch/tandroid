package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
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
                j4 j4Var = s1Var.x;
                if (j4Var.O != null) {
                    j4Var.P.setVisibility(4);
                    j4 j4Var2 = s1Var.x;
                    j4Var2.P.removeView(j4Var2.O);
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
                org.telegram.ui.Components.dv dvVar = (org.telegram.ui.Components.dv) this.b;
                if (dvVar.d != null) {
                    dvVar.getSheetContainer().setVisibility(0);
                    dvVar.e.setVisibility(4);
                    dvVar.e.removeView(dvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = dvVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        dvVar.f.onCustomViewHidden();
                    }
                    dvVar.d = null;
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
                j4 j4Var = ((s1) this.b).x;
                if (j4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    j4Var.O = view;
                    j4Var.S = customViewCallback;
                    AndroidUtilities.runOnUIThread(new bu0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.dv dvVar = (org.telegram.ui.Components.dv) this.b;
                FrameLayout frameLayout = dvVar.e;
                if (dvVar.d == null && !org.telegram.ui.Components.dh0.p0.P) {
                    dvVar.H();
                    dvVar.d = view;
                    dvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                    dvVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
