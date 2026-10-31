package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class f80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ FrameLayout b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewTreeObserver.OnPreDrawListener d;
    public final /* synthetic */ ViewGroup e;

    public /* synthetic */ f80(ViewGroup viewGroup, View view, FrameLayout frameLayout, ViewTreeObserver.OnPreDrawListener onPreDrawListener, int i10) {
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
                ((j80) this.e).s = null;
                kg.f0 f0Var = (kg.f0) this.c;
                f0Var.animate().cancel();
                f0Var.animate().alpha(0.0f).setDuration(150L).setListener(new t60(this, 3));
                break;
            default:
                ((org.telegram.ui.gz) this.e).y = null;
                kg.f0 f0Var2 = (kg.f0) this.c;
                f0Var2.animate().cancel();
                f0Var2.animate().alpha(0.0f).setDuration(150L).setListener(new org.telegram.ui.Components.voip.h2(this, 10));
                break;
        }
    }
}
