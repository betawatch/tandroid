package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes4.dex */
public final /* synthetic */ class o1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ o1(Object obj, int i10) {
        this.a = i10;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                ((h) this.b).run();
                break;
            case 1:
                z7 z7Var = (z7) this.b;
                if (z7Var.c1) {
                    z7Var.h0();
                    break;
                }
                break;
            default:
                la laVar = (la) this.b;
                PopupWindow popupWindow = laVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    laVar.c();
                    break;
                }
                break;
        }
    }
}
