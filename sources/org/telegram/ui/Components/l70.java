package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class l70 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ q70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l70(q70 q70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = q70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        q70 q70Var = this.p;
        q70.a(q70Var, viewGroup);
        Runnable runnable = q70Var.p;
        if (runnable != null) {
            runnable.run();
            q70Var.p = null;
        }
    }
}
