package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class t60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ x60 b;

    public t60(x60 x60Var, ViewGroup viewGroup) {
        this.b = x60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        x60 x60Var = this.b;
        x60Var.m = null;
        x60.a(x60Var, this.a);
        View view2 = x60Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            x60Var.p0 = null;
        }
        if (x60Var.o0 != null && (view = x60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        x60Var.o0 = null;
        x60Var.N();
        Runnable runnable = x60Var.p;
        if (runnable != null) {
            runnable.run();
            x60Var.p = null;
        }
    }
}
