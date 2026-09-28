package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class v70 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ a80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v70(a80 a80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = a80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        a80 a80Var = this.p;
        a80.a(a80Var, viewGroup);
        Runnable runnable = a80Var.p;
        if (runnable != null) {
            runnable.run();
            a80Var.p = null;
        }
    }
}
