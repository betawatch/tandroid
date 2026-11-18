package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class s60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ y60 b;

    public s60(y60 y60Var, ViewGroup viewGroup) {
        this.b = y60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        y60 y60Var = this.b;
        y60Var.m = null;
        y60.a(y60Var, this.a);
        View view2 = y60Var.s0;
        if (view2 != null) {
            view2.setPressed(false);
            y60Var.s0 = null;
        }
        if (y60Var.r0 != null && (view = y60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        y60Var.r0 = null;
        y60Var.O();
        Runnable runnable = y60Var.p;
        if (runnable != null) {
            runnable.run();
            y60Var.p = null;
        }
    }
}
