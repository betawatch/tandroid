package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class e3 {
    public final k3 a;

    public e3(Context context, u6 u6Var) {
        k3 k3Var = new k3(1, context, u6Var, false);
        this.a = k3Var;
        k3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(org.telegram.ui.Components.y6 y6Var) {
        k3 k3Var = this.a;
        k3Var.customView = y6Var;
        k3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
