package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
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
                a8 a8Var = (a8) this.b;
                if (a8Var.h1) {
                    a8Var.f0();
                    break;
                }
                break;
            default:
                ma maVar = (ma) this.b;
                PopupWindow popupWindow = maVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    maVar.c();
                    break;
                }
                break;
        }
    }
}
