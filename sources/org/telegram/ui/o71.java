package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class o71 implements View.OnClickListener {
    public final /* synthetic */ x71 a;

    public o71(x71 x71Var) {
        this.a = x71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.lj0 lj0Var = this.a.d;
        if (lj0Var.b() || lj0Var.getAnimatedDrawable() == null) {
            return;
        }
        lj0Var.getAnimatedDrawable().M(40);
        lj0Var.d();
    }
}
