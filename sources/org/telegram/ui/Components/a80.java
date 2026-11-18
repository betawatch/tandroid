package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class a80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ a80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
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
                ((e80) this.e).s = null;
                hi.m5 m5Var = (hi.m5) this.c;
                m5Var.animate().cancel();
                m5Var.animate().alpha(0.0f).setDuration(150L).setListener(new q60(this, 3));
                break;
            default:
                ((org.telegram.ui.iy) this.e).y = null;
                hi.m5 m5Var2 = (hi.m5) this.c;
                m5Var2.animate().cancel();
                m5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.ay(this, 0));
                break;
        }
    }
}
