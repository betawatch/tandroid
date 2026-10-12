package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class s90 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ s90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((w90) this.e).s = null;
                di.p6 p6Var = (di.p6) this.c;
                p6Var.animate().cancel();
                p6Var.animate().alpha(0.0f).setDuration(150L).setListener(new k90(this, 1));
                break;
            default:
                ((org.telegram.ui.f00) this.e).x = null;
                di.p6 p6Var2 = (di.p6) this.c;
                p6Var2.animate().cancel();
                p6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new u61(this, 24));
                break;
        }
    }
}
