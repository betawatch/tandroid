package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class g60 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ l60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g60(l60 l60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = l60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        l60 l60Var = this.p;
        l60.a(l60Var, viewGroup);
        Runnable runnable = l60Var.p;
        if (runnable != null) {
            runnable.run();
            l60Var.p = null;
        }
    }
}
