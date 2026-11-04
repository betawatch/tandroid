package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ f60 b;

    public c60(f60 f60Var, ViewGroup viewGroup) {
        this.b = f60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        f60 f60Var = this.b;
        f60Var.m = null;
        f60.a(f60Var, this.a);
        View view2 = f60Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            f60Var.p0 = null;
        }
        if (f60Var.o0 != null && (view = f60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        f60Var.o0 = null;
        f60Var.N();
        Runnable runnable = f60Var.p;
        if (runnable != null) {
            runnable.run();
            f60Var.p = null;
        }
    }
}
