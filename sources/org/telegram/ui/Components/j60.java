package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class j60 implements PopupWindow.OnDismissListener {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ m60 b;

    public j60(m60 m60Var, ViewGroup viewGroup) {
        this.b = m60Var;
        this.a = viewGroup;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        View view;
        m60 m60Var = this.b;
        m60Var.m = null;
        m60.a(m60Var, this.a);
        View view2 = m60Var.p0;
        if (view2 != null) {
            view2.setPressed(false);
            m60Var.p0 = null;
        }
        if (m60Var.o0 != null && (view = m60Var.f) != null) {
            view.setOnTouchListener(null);
        }
        m60Var.o0 = null;
        m60Var.N();
        Runnable runnable = m60Var.p;
        if (runnable != null) {
            runnable.run();
            m60Var.p = null;
        }
    }
}
