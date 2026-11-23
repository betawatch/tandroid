package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes4.dex */
public final /* synthetic */ class t1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ t1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        switch (this.a) {
            case 0:
                ((p) this.b).run();
                break;
            case 1:
                s8 s8Var = (s8) this.b;
                if (s8Var.i1) {
                    s8Var.f0();
                    break;
                }
                break;
            default:
                eb ebVar = (eb) this.b;
                PopupWindow popupWindow = ebVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    ebVar.c();
                    break;
                }
                break;
        }
    }
}
