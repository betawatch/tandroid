package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-1181a9f210c4244598aa36bb39e1460f3842f305ed8c0c95af755ee091fedd7d */
/* loaded from: classes3.dex */
public final class j70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ n70 b;

    public j70(n70 n70Var, ViewGroup viewGroup) {
        this.b = n70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        n70 n70Var = this.b;
        n70Var.m = null;
        n70.a(n70Var, this.a);
        View view2 = n70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            n70Var.p0 = null;
        }
        if (n70Var.o0 != null && (view = n70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        n70Var.o0 = null;
        n70Var.N();
        Runnable runnable = n70Var.p;
        if (runnable != null) {
            runnable.run();
            n70Var.p = null;
        }
    }
}
