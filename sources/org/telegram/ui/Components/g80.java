package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class g80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ k80 b;

    public g80(k80 k80Var, ViewGroup viewGroup) {
        this.b = k80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        k80 k80Var = this.b;
        k80Var.m = null;
        k80.a(k80Var, this.a);
        View view2 = k80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            k80Var.p0 = null;
        }
        if (k80Var.o0 != null && (view = k80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        k80Var.o0 = null;
        k80Var.N();
        Runnable runnable = k80Var.p;
        if (runnable != null) {
            runnable.run();
            k80Var.p = null;
        }
    }
}
