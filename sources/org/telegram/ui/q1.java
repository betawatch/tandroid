package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
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
                k4 k4Var = u1Var.x;
                if (k4Var.O != null) {
                    k4Var.P.setVisibility(4);
                    k4 k4Var2 = u1Var.x;
                    k4Var2.P.removeView(k4Var2.O);
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
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.b;
                if (cvVar.d != null) {
                    cvVar.getSheetContainer().setVisibility(0);
                    cvVar.e.setVisibility(4);
                    cvVar.e.removeView(cvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = cvVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        cvVar.f.onCustomViewHidden();
                    }
                    cvVar.d = null;
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
                k4 k4Var = ((u1) this.b).x;
                if (k4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    k4Var.O = view;
                    k4Var.S = customViewCallback;
                    AndroidUtilities.runOnUIThread(new vt0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.cv cvVar = (org.telegram.ui.Components.cv) this.b;
                FrameLayout frameLayout = cvVar.e;
                if (cvVar.d == null && !org.telegram.ui.Components.dh0.p0.P) {
                    cvVar.G();
                    cvVar.d = view;
                    cvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.z5.c(-1.0f, -1));
                    cvVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
