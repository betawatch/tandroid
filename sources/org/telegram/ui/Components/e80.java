package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class e80 extends org.telegram.ui.ActionBar.m1 {
    public final /* synthetic */ ViewGroup o;
    public final /* synthetic */ j80 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e80(j80 j80Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.p = j80Var;
        this.o = viewGroup;
    }

    @Override // org.telegram.ui.ActionBar.m1, android.widget.PopupWindow
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.o;
        j80 j80Var = this.p;
        j80.a(j80Var, viewGroup);
        Runnable runnable = j80Var.p;
        if (runnable != null) {
            runnable.run();
            j80Var.p = null;
        }
    }
}
