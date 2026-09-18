package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.t6;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class b3 {
    public final g3 a;

    public b3(Context context, f6 f6Var) {
        g3 g3Var = new g3(1, context, f6Var, false);
        this.a = g3Var;
        g3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(t6 t6Var) {
        g3 g3Var = this.a;
        g3Var.customView = t6Var;
        g3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
