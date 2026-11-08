package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class k1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k1(Object obj, int i7) {
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
                b8 b8Var = (b8) this.b;
                if (b8Var.h1) {
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
