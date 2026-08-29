package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class f70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ j70 b;

    public f70(j70 j70Var, ViewGroup viewGroup) {
        this.b = j70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        j70 j70Var = this.b;
        j70Var.m = null;
        j70.a(j70Var, this.a);
        View view2 = j70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            j70Var.p0 = null;
        }
        if (j70Var.o0 != null && (view = j70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        j70Var.o0 = null;
        j70Var.N();
        Runnable runnable = j70Var.p;
        if (runnable != null) {
            runnable.run();
            j70Var.p = null;
        }
    }
}
