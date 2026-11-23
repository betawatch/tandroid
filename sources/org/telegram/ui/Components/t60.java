package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class t60 extends org.telegram.ui.ActionBar.g1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ a70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t60(a70 a70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = a70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.g1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        a70 a70Var = this.p;
        a70.a(a70Var, viewGroup);
        Runnable runnable = a70Var.p;
        if (runnable != null) {
            runnable.run();
            a70Var.p = null;
        }
    }
}
