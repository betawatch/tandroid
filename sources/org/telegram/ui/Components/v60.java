package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class v60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ z60 b;

    public v60(z60 z60Var, ViewGroup viewGroup) {
        this.b = z60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        z60 z60Var = this.b;
        z60Var.m = null;
        z60.a(z60Var, this.a);
        View view2 = z60Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            z60Var.p0 = null;
        }
        if (z60Var.o0 != null && (view = z60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        z60Var.o0 = null;
        z60Var.N();
        Runnable runnable = z60Var.p;
        if (runnable != null) {
            runnable.run();
            z60Var.p = null;
        }
    }
}
