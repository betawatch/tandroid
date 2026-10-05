package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class x70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ b80 b;

    public x70(b80 b80Var, ViewGroup viewGroup) {
        this.b = b80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        b80 b80Var = this.b;
        b80Var.m = null;
        b80.a(b80Var, this.a);
        View view2 = b80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            b80Var.p0 = null;
        }
        if (b80Var.o0 != null && (view = b80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        b80Var.o0 = null;
        b80Var.N();
        Runnable runnable = b80Var.p;
        if (runnable != null) {
            runnable.run();
            b80Var.p = null;
        }
    }
}
