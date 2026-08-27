package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class e80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ e80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((i80) this.e).s = null;
                ag.t0 t0Var = (ag.t0) this.c;
                t0Var.animate().cancel();
                t0Var.animate().alpha(0.0f).setDuration(150L).setListener(new sz(this, 5));
                break;
            default:
                ((org.telegram.ui.mz) this.e).x = null;
                ag.t0 t0Var2 = (ag.t0) this.c;
                t0Var2.animate().cancel();
                t0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new f11(this, 28));
                break;
        }
    }
}
