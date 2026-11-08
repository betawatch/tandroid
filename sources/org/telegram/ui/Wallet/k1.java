package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
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
