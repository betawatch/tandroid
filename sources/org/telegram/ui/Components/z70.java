package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class z70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ z70(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i7) {
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
                ((d80) this.e).s = null;
                hi.w5 w5Var = (hi.w5) this.c;
                w5Var.animate().cancel();
                w5Var.animate().alpha(0.0f).setDuration(150L).setListener(new p60(this, 3));
                break;
            default:
                ((org.telegram.ui.hy) this.e).y = null;
                hi.w5 w5Var2 = (hi.w5) this.c;
                w5Var2.animate().cancel();
                w5Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.zx(this, 0));
                break;
        }
    }
}
