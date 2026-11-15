package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
                c8 c8Var = (c8) this.b;
                if (c8Var.i1) {
                    c8Var.f0();
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
