package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes.dex */
public final /* synthetic */ class i1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i1(Object obj, int i3) {
        this.a = i3;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                ((g) this.b).run();
                break;
            case 1:
                b8 b8Var = (b8) this.b;
                if (b8Var.i1) {
                    b8Var.f0();
                    break;
                }
                break;
            default:
                na naVar = (na) this.b;
                PopupWindow popupWindow = naVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    naVar.c();
                    break;
                }
                break;
        }
    }
}
