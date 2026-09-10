package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class r70 extends org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ w70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r70(w70 w70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = w70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.p1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        w70 w70Var = this.p;
        w70.a(w70Var, viewGroup);
        Runnable runnable = w70Var.p;
        if (runnable != null) {
            runnable.run();
            w70Var.p = null;
        }
    }
}
