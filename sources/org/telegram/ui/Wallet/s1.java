package org.telegram.ui.Wallet;

import android.view.ViewTreeObserver;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes4.dex */
public final /* synthetic */ class s1 implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s1(Object obj, int i7) {
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
                r8 r8Var = (r8) this.b;
                if (r8Var.i1) {
                    r8Var.f0();
                    break;
                }
                break;
            default:
                db dbVar = (db) this.b;
                PopupWindow popupWindow = dbVar.s;
                if (popupWindow != null && popupWindow.isShowing()) {
                    dbVar.c();
                    break;
                }
                break;
        }
    }
}
