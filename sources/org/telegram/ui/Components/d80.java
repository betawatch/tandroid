package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public final class d80 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ i80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d80(i80 i80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = i80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        i80 i80Var = this.p;
        i80.a(i80Var, viewGroup);
        Runnable runnable = i80Var.p;
        if (runnable != null) {
            runnable.run();
            i80Var.p = null;
        }
    }
}
