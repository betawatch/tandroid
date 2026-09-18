package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class r70 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ w70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(w70 w70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = w70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        w70 w70Var = this.p;
        w70.a(w70Var, viewGroup);
        Runnable runnable = w70Var.p;
        if (runnable != null) {
            runnable.run();
            w70Var.p = null;
        }
    }
}
