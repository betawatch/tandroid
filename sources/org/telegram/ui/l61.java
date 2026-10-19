package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class l61 implements View.OnClickListener {
    public final /* synthetic */ u61 a;

    public l61(u61 u61Var) {
        this.a = u61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.xj0 xj0Var = this.a.d;
        if (xj0Var.b() || xj0Var.getAnimatedDrawable() == null) {
            return;
        }
        xj0Var.getAnimatedDrawable().M(40);
        xj0Var.d();
    }
}
