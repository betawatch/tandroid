package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class b90 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ b90(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((f90) this.e).s = null;
                bi.s7 s7Var = (bi.s7) this.c;
                s7Var.animate().cancel();
                s7Var.animate().alpha(0.0f).setDuration(150L).setListener(new rm(this, 17));
                break;
            default:
                ((org.telegram.ui.c00) this.e).x = null;
                bi.s7 s7Var2 = (bi.s7) this.c;
                s7Var2.animate().cancel();
                s7Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.v2(this, 10));
                break;
        }
    }
}
