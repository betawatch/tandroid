package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class e80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ i80 b;

    public e80(i80 i80Var, ViewGroup viewGroup) {
        this.b = i80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        i80 i80Var = this.b;
        i80Var.m = null;
        i80.a(i80Var, this.a);
        View view2 = i80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            i80Var.p0 = null;
        }
        if (i80Var.o0 != null && (view = i80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        i80Var.o0 = null;
        i80Var.N();
        Runnable runnable = i80Var.p;
        if (runnable != null) {
            runnable.run();
            i80Var.p = null;
        }
    }
}
