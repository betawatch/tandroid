package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
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
                t7 t7Var = (t7) this.b;
                if (t7Var.h1) {
                    t7Var.f0();
                    break;
                }
                break;
            default:
                ga gaVar = (ga) this.b;
                PopupWindow popupWindow = gaVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    gaVar.c();
                    break;
                }
                break;
        }
    }
}
