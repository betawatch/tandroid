package org.telegram.ui.ActionBar;

import android.content.Context;
import android.view.ViewGroup;
import org.telegram.ui.Components.v6;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class a3 {
    public final f3 a;

    public a3(Context context, d6 d6Var) {
        f3 f3Var = new f3(1, context, d6Var, false);
        this.a = f3Var;
        f3Var.fixNavigationBar();
    }

    public final void a() {
        this.a.applyBottomPadding = false;
    }

    public final void b(ViewGroup viewGroup) {
        this.a.customView = viewGroup;
    }

    public final void c(v6 v6Var) {
        f3 f3Var = this.a;
        f3Var.customView = v6Var;
        f3Var.customViewGravity = 49;
    }

    public final void d() {
        this.a.dimBehind = false;
    }
}
