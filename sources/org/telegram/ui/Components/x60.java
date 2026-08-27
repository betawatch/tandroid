package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class x60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ b70 b;

    public x60(b70 b70Var, ViewGroup viewGroup) {
        this.b = b70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        b70 b70Var = this.b;
        b70Var.m = null;
        b70.a(b70Var, this.a);
        View view2 = b70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            b70Var.p0 = null;
        }
        if (b70Var.o0 != null && (view = b70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        b70Var.o0 = null;
        b70Var.N();
        Runnable runnable = b70Var.p;
        if (runnable != null) {
            runnable.run();
            b70Var.p = null;
        }
    }
}
