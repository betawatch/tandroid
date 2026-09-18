package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class s70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ w70 b;

    public s70(w70 w70Var, ViewGroup viewGroup) {
        this.b = w70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        w70 w70Var = this.b;
        w70Var.m = null;
        w70.a(w70Var, this.a);
        View view2 = w70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            w70Var.p0 = null;
        }
        if (w70Var.o0 != null && (view = w70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        w70Var.o0 = null;
        w70Var.N();
        Runnable runnable = w70Var.p;
        if (runnable != null) {
            runnable.run();
            w70Var.p = null;
        }
    }
}
