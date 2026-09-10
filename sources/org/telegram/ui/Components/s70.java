package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class s70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ w70 b;

    public s70(w70 w70Var, ViewGroup viewGroup) {
        this.b = w70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        w70 w70Var = this.b;
        w70Var.m = null;
        w70.a(w70Var, this.a);
        View view2 = w70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            w70Var.p0 = null;
        }
        if (w70Var.o0 != null && (view = w70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        w70Var.o0 = null;
        w70Var.N();
        Runnable runnable = w70Var.p;
        if (runnable != null) {
            runnable.run();
            w70Var.p = null;
        }
    }
}
