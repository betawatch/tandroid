package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.v6;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
/* loaded from: classes3.dex */
public final class z2 {
    public final e3 a;

    public z2(Context context, d6 d6Var) {
        e3 e3Var = new e3(1, context, d6Var, false);
        this.a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(v6 v6Var) {
        e3 e3Var = this.a;
        e3Var.customView = v6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
