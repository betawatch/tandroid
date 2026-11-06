package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes4.dex */
public final /* synthetic */ class m1 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m1(Object obj, int i7) {
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
