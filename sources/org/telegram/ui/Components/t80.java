package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class t80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ t80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
        this.a = i10;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((x80) this.e).s = null;
                eg.i0 i0Var = (eg.i0) this.c;
                i0Var.animate().cancel();
                i0Var.animate().alpha(0.0f).setDuration(150L).setListener(new a9(this, 26));
                break;
            default:
                ((org.telegram.ui.wz) this.e).x = null;
                eg.i0 i0Var2 = (eg.i0) this.c;
                i0Var2.animate().cancel();
                i0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new f91(this, 19));
                break;
        }
    }
}
