package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class h80 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ m80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h80(m80 m80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = m80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        m80 m80Var = this.p;
        m80.a(m80Var, viewGroup);
        Runnable runnable = m80Var.p;
        if (runnable != null) {
            runnable.run();
            m80Var.p = null;
        }
    }
}
