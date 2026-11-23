package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class r60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ x60 b;

    public r60(x60 x60Var, ViewGroup viewGroup) {
        this.b = x60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        x60 x60Var = this.b;
        x60Var.m = null;
        x60.a(x60Var, this.a);
        View view2 = x60Var.s0;
        if (view2 != null) {
            view2.setPressed(false);
            x60Var.s0 = null;
        }
        if (x60Var.r0 != null && (view = x60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        x60Var.r0 = null;
        x60Var.O();
        Runnable runnable = x60Var.p;
        if (runnable != null) {
            runnable.run();
            x60Var.p = null;
        }
    }
}
