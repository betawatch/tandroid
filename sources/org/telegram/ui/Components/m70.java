package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class m70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ q70 b;

    public m70(q70 q70Var, ViewGroup viewGroup) {
        this.b = q70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        q70 q70Var = this.b;
        q70Var.m = null;
        q70.a(q70Var, this.a);
        View view2 = q70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            q70Var.p0 = null;
        }
        if (q70Var.o0 != null && (view = q70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        q70Var.o0 = null;
        q70Var.N();
        Runnable runnable = q70Var.p;
        if (runnable != null) {
            runnable.run();
            q70Var.p = null;
        }
    }
}
