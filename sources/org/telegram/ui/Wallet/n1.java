package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
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
                ia iaVar = (ia) this.b;
                PopupWindow popupWindow = iaVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    iaVar.c();
                    break;
                }
                break;
        }
    }
}
