package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class z2 {
    public final e3 a;

    public z2(Context context, c6 c6Var) {
        e3 e3Var = new e3(context, c6Var, false, false);
        this.a = e3Var;
        e3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(p6 p6Var) {
        e3 e3Var = this.a;
        e3Var.customView = p6Var;
        e3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
