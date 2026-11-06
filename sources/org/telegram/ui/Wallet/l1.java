package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
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
