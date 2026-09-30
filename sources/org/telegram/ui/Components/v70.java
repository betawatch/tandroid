package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
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
