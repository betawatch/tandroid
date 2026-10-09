package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class l80 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ p80 b;

    public l80(p80 p80Var, ViewGroup viewGroup) {
        this.b = p80Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        p80 p80Var = this.b;
        p80Var.m = null;
        p80.a(p80Var, this.a);
        View view2 = p80Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            p80Var.p0 = null;
        }
        if (p80Var.o0 != null && (view = p80Var.f) != null) {
            view.setOnTouchListener(null);
        }
        p80Var.o0 = null;
        p80Var.N();
        Runnable runnable = p80Var.p;
        if (runnable != null) {
            runnable.run();
            p80Var.p = null;
        }
    }
}
