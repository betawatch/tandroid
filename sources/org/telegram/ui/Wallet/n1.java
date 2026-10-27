package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes4.dex */
public final /* synthetic */ class n1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n1(Object obj, int i10) {
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
                t7 t7Var = (t7) this.b;
                if (t7Var.h1) {
                    t7Var.f0();
                    break;
                }
                break;
            default:
                ha haVar = (ha) this.b;
                PopupWindow popupWindow = haVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    haVar.c();
                    break;
                }
                break;
        }
    }
}
