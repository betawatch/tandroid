package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final /* synthetic */ class k1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                ((g) this.b).run();
                break;
            case 1:
                h8 h8Var = (h8) this.b;
                if (h8Var.h1) {
                    h8Var.f0();
                    break;
                }
                break;
            default:
                ra raVar = (ra) this.b;
                PopupWindow popupWindow = raVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    raVar.c();
                    break;
                }
                break;
        }
    }
}
