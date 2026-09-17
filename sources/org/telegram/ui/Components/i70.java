package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
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
