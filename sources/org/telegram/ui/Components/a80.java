package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ a80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i9) {
        this.a = i9;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((e80) this.e).s = null;
                kh.h6 h6Var = (kh.h6) this.c;
                h6Var.animate().cancel();
                h6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r60(this, 3));
                break;
            default:
                ((org.telegram.ui.jz) this.e).x = null;
                kh.h6 h6Var2 = (kh.h6) this.c;
                h6Var2.animate().cancel();
                h6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new y11(this, 26));
                break;
        }
    }
}
