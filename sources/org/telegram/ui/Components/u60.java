package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class u60 extends org.telegram.ui.ActionBar.k1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ z60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u60(z60 z60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = z60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.k1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        z60 z60Var = this.p;
        z60.a(z60Var, viewGroup);
        Runnable runnable = z60Var.p;
        if (runnable != null) {
            runnable.run();
            z60Var.p = null;
        }
    }
}
