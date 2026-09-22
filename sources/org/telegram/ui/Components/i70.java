package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class i70 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ n70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i70(n70 n70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = n70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        n70 n70Var = this.p;
        n70.a(n70Var, viewGroup);
        Runnable runnable = n70Var.p;
        if (runnable != null) {
            runnable.run();
            n70Var.p = null;
        }
    }
}
