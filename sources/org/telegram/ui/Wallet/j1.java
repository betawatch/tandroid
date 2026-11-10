package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes4.dex */
public final /* synthetic */ class j1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                ((g) this.b).run();
                break;
            case 1:
                d8 d8Var = (d8) this.b;
                if (d8Var.h1) {
                    d8Var.f0();
                    break;
                }
                break;
            default:
                pa paVar = (pa) this.b;
                PopupWindow popupWindow = paVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    paVar.c();
                    break;
                }
                break;
        }
    }
}
