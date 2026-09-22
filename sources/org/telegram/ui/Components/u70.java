package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class u70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ y70 b;

    public u70(y70 y70Var, ViewGroup viewGroup) {
        this.b = y70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        y70 y70Var = this.b;
        y70Var.m = null;
        y70.a(y70Var, this.a);
        View view2 = y70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            y70Var.p0 = null;
        }
        if (y70Var.o0 != null && (view = y70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        y70Var.o0 = null;
        y70Var.N();
        Runnable runnable = y70Var.p;
        if (runnable != null) {
            runnable.run();
            y70Var.p = null;
        }
    }
}
