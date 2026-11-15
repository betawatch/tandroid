package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class p70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ p70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
        this.a = i7;
        this.e = viewGroup;
        this.c = view;
        this.b = frameLayout;
        this.d = onPreDrawListener;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        switch (this.a) {
            case 0:
                ((t70) this.e).s = null;
                hi.n5 n5Var = (hi.n5) this.c;
                n5Var.animate().cancel();
                n5Var.animate().alpha(0.0f).setDuration(150L).setListener(new h60(this, 3));
                break;
            default:
                ((org.telegram.ui.fy) this.e).y = null;
                hi.n5 n5Var2 = (hi.n5) this.c;
                n5Var2.animate().cancel();
                n5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.xx(this, 0));
                break;
        }
    }
}
