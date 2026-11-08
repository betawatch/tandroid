package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class g60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ k60 b;

    public g60(k60 k60Var, ViewGroup viewGroup) {
        this.b = k60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        k60 k60Var = this.b;
        k60Var.m = null;
        k60.a(k60Var, this.a);
        View view2 = k60Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            k60Var.p0 = null;
        }
        if (k60Var.o0 != null && (view = k60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        k60Var.o0 = null;
        k60Var.N();
        Runnable runnable = k60Var.p;
        if (runnable != null) {
            runnable.run();
            k60Var.p = null;
        }
    }
}
