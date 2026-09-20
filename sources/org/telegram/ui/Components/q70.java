package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class q70 extends org.telegram.ui.ActionBar.n1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ v70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q70(v70 v70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = v70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.n1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        v70 v70Var = this.p;
        v70.a(v70Var, viewGroup);
        Runnable runnable = v70Var.p;
        if (runnable != null) {
            runnable.run();
            v70Var.p = null;
        }
    }
}
