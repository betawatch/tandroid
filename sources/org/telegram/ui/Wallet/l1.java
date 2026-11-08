package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes4.dex */
public final /* synthetic */ class l1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l1(Object obj, int i7) {
        this.a = i7;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        switch (this.a) {
            case 0:
                ((g) this.b).run();
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
