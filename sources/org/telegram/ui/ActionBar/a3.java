package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.p6;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a3 {
    public final f3 a;

    public a3(Context context, b6 b6Var) {
        f3 f3Var = new f3(context, b6Var, false, false);
        this.a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(p6 p6Var) {
        f3 f3Var = this.a;
        f3Var.customView = p6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
