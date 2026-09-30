package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class w70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ a80 b;

    public w70(a80 a80Var, ViewGroup viewGroup) {
        this.b = a80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        a80 a80Var = this.b;
        a80Var.m = null;
        a80.a(a80Var, this.a);
        View view2 = a80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            a80Var.p0 = null;
        }
        if (a80Var.o0 != null && (view = a80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        a80Var.o0 = null;
        a80Var.N();
        Runnable runnable = a80Var.p;
        if (runnable != null) {
            runnable.run();
            a80Var.p = null;
        }
    }
}
