package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class e70 extends org.telegram.ui.ActionBar.o1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ j70 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e70(j70 j70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = j70Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.o1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        j70 j70Var = this.p;
        j70.a(j70Var, viewGroup);
        Runnable runnable = j70Var.p;
        if (runnable != null) {
            runnable.run();
            j70Var.p = null;
        }
    }
}
