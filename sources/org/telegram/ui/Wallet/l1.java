package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(Object obj, int i7) {
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
                c8 c8Var = (c8) this.b;
                if (c8Var.h1) {
                    c8Var.f0();
                    break;
                }
                break;
            default:
                oa oaVar = (oa) this.b;
                PopupWindow popupWindow = oaVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    oaVar.c();
                    break;
                }
                break;
        }
    }
}
