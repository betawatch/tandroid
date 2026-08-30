package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class j70 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ o70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j70(o70 o70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = o70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        o70 o70Var = this.p;
        o70.a(o70Var, viewGroup);
        Runnable runnable = o70Var.p;
        if (runnable != null) {
            runnable.run();
            o70Var.p = null;
        }
    }
}
