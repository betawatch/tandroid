package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class r70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ v70 b;

    public r70(v70 v70Var, ViewGroup viewGroup) {
        this.b = v70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        v70 v70Var = this.b;
        v70Var.m = null;
        v70.a(v70Var, this.a);
        View view2 = v70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            v70Var.p0 = null;
        }
        if (v70Var.o0 != null && (view = v70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        v70Var.o0 = null;
        v70Var.N();
        Runnable runnable = v70Var.p;
        if (runnable != null) {
            runnable.run();
            v70Var.p = null;
        }
    }
}
