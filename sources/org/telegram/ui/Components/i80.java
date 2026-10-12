package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class i80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ m80 b;

    public i80(m80 m80Var, ViewGroup viewGroup) {
        this.b = m80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        m80 m80Var = this.b;
        m80Var.m = null;
        m80.a(m80Var, this.a);
        View view2 = m80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            m80Var.p0 = null;
        }
        if (m80Var.o0 != null && (view = m80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        m80Var.o0 = null;
        m80Var.N();
        Runnable runnable = m80Var.p;
        if (runnable != null) {
            runnable.run();
            m80Var.p = null;
        }
    }
}
