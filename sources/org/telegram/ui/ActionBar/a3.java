package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.u6;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class a3 {
    public final f3 a;

    public a3(Context context, f6 f6Var) {
        f3 f3Var = new f3(1, context, f6Var, false);
        this.a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(u6 u6Var) {
        f3 f3Var = this.a;
        f3Var.customView = u6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
