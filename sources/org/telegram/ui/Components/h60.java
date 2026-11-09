package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class h60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ l60 b;

    public h60(l60 l60Var, ViewGroup viewGroup) {
        this.b = l60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        l60 l60Var = this.b;
        l60Var.m = null;
        l60.a(l60Var, this.a);
        View view2 = l60Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            l60Var.p0 = null;
        }
        if (l60Var.o0 != null && (view = l60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        l60Var.o0 = null;
        l60Var.N();
        Runnable runnable = l60Var.p;
        if (runnable != null) {
            runnable.run();
            l60Var.p = null;
        }
    }
}
