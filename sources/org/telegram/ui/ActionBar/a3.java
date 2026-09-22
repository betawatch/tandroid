package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.t6;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class a3 {
    public final f3 a;

    public a3(Context context, e6 e6Var) {
        f3 f3Var = new f3(1, context, e6Var, false);
        this.a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(t6 t6Var) {
        f3 f3Var = this.a;
        f3Var.customView = t6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
