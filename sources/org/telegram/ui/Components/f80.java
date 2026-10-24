package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class f80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ j80 b;

    public f80(j80 j80Var, ViewGroup viewGroup) {
        this.b = j80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        j80 j80Var = this.b;
        j80Var.m = null;
        j80.a(j80Var, this.a);
        View view2 = j80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            j80Var.p0 = null;
        }
        if (j80Var.o0 != null && (view = j80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        j80Var.o0 = null;
        j80Var.N();
        Runnable runnable = j80Var.p;
        if (runnable != null) {
            runnable.run();
            j80Var.p = null;
        }
    }
}
