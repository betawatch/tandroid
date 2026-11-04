package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class i70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ i70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i3) {
        this.a = i3;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((m70) this.e).s = null;
                gi.n5 n5Var = (gi.n5) this.c;
                n5Var.animate().cancel();
                n5Var.animate().alpha(0.0f).setDuration(150L).setListener(new a60(this, 3));
                break;
            default:
                ((org.telegram.ui.zx) this.e).y = null;
                gi.n5 n5Var2 = (gi.n5) this.c;
                n5Var2.animate().cancel();
                n5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Cells.w9(this, 29));
                break;
        }
    }
}
