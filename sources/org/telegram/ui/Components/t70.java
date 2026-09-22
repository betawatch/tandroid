package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class t70 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ y70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t70(y70 y70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = y70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        y70 y70Var = this.p;
        y70.a(y70Var, viewGroup);
        Runnable runnable = y70Var.p;
        if (runnable != null) {
            runnable.run();
            y70Var.p = null;
        }
    }
}
