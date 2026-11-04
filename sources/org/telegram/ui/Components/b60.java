package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class b60 extends org.telegram.ui.ActionBar.f1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ f60 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b60(f60 f60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = f60Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.f1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        f60 f60Var = this.p;
        f60.a(f60Var, viewGroup);
        Runnable runnable = f60Var.p;
        if (runnable != null) {
            runnable.run();
            f60Var.p = null;
        }
    }
}
