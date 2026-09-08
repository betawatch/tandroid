package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class s80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ s80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((w80) this.e).s = null;
                di.r6 r6Var = (di.r6) this.c;
                r6Var.animate().cancel();
                r6Var.animate().alpha(0.0f).setDuration(150L).setListener(new r80(this, 0));
                break;
            default:
                ((org.telegram.ui.a00) this.e).x = null;
                di.r6 r6Var2 = (di.r6) this.c;
                r6Var2.animate().cancel();
                r6Var2.animate().alpha(0.0f).setDuration(150L).setListener(new k61(this, 23));
                break;
        }
    }
}
