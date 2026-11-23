package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class u60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ a70 b;

    public u60(a70 a70Var, ViewGroup viewGroup) {
        this.b = a70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        a70 a70Var = this.b;
        a70Var.m = null;
        a70.a(a70Var, this.a);
        View view2 = a70Var.s0;
        if (view2 != null) {
            view2.setPressed(false);
            a70Var.s0 = null;
        }
        if (a70Var.r0 != null && (view = a70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        a70Var.r0 = null;
        a70Var.O();
        Runnable runnable = a70Var.p;
        if (runnable != null) {
            runnable.run();
            a70Var.p = null;
        }
    }
}
