package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class g80 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ l80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g80(l80 l80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = l80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        l80 l80Var = this.p;
        l80.a(l80Var, viewGroup);
        Runnable runnable = l80Var.p;
        if (runnable != null) {
            runnable.run();
            l80Var.p = null;
        }
    }
}
