package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class l61 implements View.OnClickListener {
    public final /* synthetic */ u61 a;

    public l61(u61 u61Var) {
        this.a = u61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.yj0 yj0Var = this.a.d;
        if (yj0Var.b() || yj0Var.getAnimatedDrawable() == null) {
            return;
        }
        yj0Var.getAnimatedDrawable().M(40);
        yj0Var.d();
    }
}
