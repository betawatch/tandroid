package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class s60 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ x60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s60(x60 x60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = x60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        x60 x60Var = this.p;
        x60.a(x60Var, viewGroup);
        Runnable runnable = x60Var.p;
        if (runnable != null) {
            runnable.run();
            x60Var.p = null;
        }
    }
}
