package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class k70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ o70 b;

    public k70(o70 o70Var, ViewGroup viewGroup) {
        this.b = o70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        o70 o70Var = this.b;
        o70Var.m = null;
        o70.a(o70Var, this.a);
        View view2 = o70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            o70Var.p0 = null;
        }
        if (o70Var.o0 != null && (view = o70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        o70Var.o0 = null;
        o70Var.N();
        Runnable runnable = o70Var.p;
        if (runnable != null) {
            runnable.run();
            o70Var.p = null;
        }
    }
}
