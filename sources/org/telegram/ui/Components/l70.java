package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class l70 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ p70 b;

    public l70(p70 p70Var, ViewGroup viewGroup) {
        this.b = p70Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        p70 p70Var = this.b;
        p70Var.m = null;
        p70.a(p70Var, this.a);
        View view2 = p70Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            p70Var.p0 = null;
        }
        if (p70Var.o0 != null && (view = p70Var.f) != null) {
            view.setOnTouchListener(null);
        }
        p70Var.o0 = null;
        p70Var.N();
        Runnable runnable = p70Var.p;
        if (runnable != null) {
            runnable.run();
            p70Var.p = null;
        }
    }
}
