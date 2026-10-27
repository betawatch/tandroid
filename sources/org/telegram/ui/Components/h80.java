package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class h80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ l80 b;

    public h80(l80 l80Var, ViewGroup viewGroup) {
        this.b = l80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        l80 l80Var = this.b;
        l80Var.m = null;
        l80.a(l80Var, this.a);
        View view2 = l80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            l80Var.p0 = null;
        }
        if (l80Var.o0 != null && (view = l80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        l80Var.o0 = null;
        l80Var.N();
        Runnable runnable = l80Var.p;
        if (runnable != null) {
            runnable.run();
            l80Var.p = null;
        }
    }
}
