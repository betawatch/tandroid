package org.telegram.ui;

import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebChromeClient;
import android.widget.FrameLayout;
import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class p1 extends WebChromeClient {
    public final /* synthetic */ int a;
    public final /* synthetic */ KeyEvent.Callback b;

    public /* synthetic */ p1(KeyEvent.Callback callback, int i10) {
        this.a = i10;
        this.b = callback;
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        switch (this.a) {
            case 0:
                super.onHideCustomView();
                t1 t1Var = (t1) this.b;
                i4 i4Var = t1Var.x;
                if (i4Var.O != null) {
                    i4Var.P.setVisibility(4);
                    i4 i4Var2 = t1Var.x;
                    i4Var2.P.removeView(i4Var2.O);
                    WebChromeClient.CustomViewCallback customViewCallback = t1Var.x.S;
                    if (customViewCallback != null && !customViewCallback.getClass().getName().contains(".chromium.")) {
                        t1Var.x.S.onCustomViewHidden();
                    }
                    t1Var.x.O = null;
                    break;
                }
                break;
            default:
                super.onHideCustomView();
                org.telegram.ui.Components.lv lvVar = (org.telegram.ui.Components.lv) this.b;
                if (lvVar.d != null) {
                    lvVar.getSheetContainer().setVisibility(0);
                    lvVar.e.setVisibility(4);
                    lvVar.e.removeView(lvVar.d);
                    WebChromeClient.CustomViewCallback customViewCallback2 = lvVar.f;
                    if (customViewCallback2 != null && !customViewCallback2.getClass().getName().contains(".chromium.")) {
                        lvVar.f.onCustomViewHidden();
                    }
                    lvVar.d = null;
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
                i4 i4Var = ((t1) this.b).x;
                if (i4Var.O != null) {
                    customViewCallback.onCustomViewHidden();
                    break;
                } else {
                    i4Var.O = view;
                    i4Var.S = customViewCallback;
                    AndroidUtilities.runOnUIThread(new nu0(this, 7), 100L);
                    break;
                }
            default:
                org.telegram.ui.Components.lv lvVar = (org.telegram.ui.Components.lv) this.b;
                FrameLayout frameLayout = lvVar.e;
                if (lvVar.d == null && !org.telegram.ui.Components.gh0.p0.P) {
                    lvVar.I();
                    lvVar.d = view;
                    lvVar.getSheetContainer().setVisibility(4);
                    frameLayout.setVisibility(0);
                    frameLayout.addView(view, w7.x5.d(-1.0f, -1));
                    lvVar.f = customViewCallback;
                    break;
                } else {
                    customViewCallback.onCustomViewHidden();
                    break;
                }
        }
    }
}
