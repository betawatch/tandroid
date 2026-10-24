package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class p61 implements View.OnClickListener {
    public final /* synthetic */ y61 a;

    public p61(y61 y61Var) {
        this.a = y61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.bk0 bk0Var = this.a.d;
        if (bk0Var.b() || bk0Var.getAnimatedDrawable() == null) {
            return;
        }
        bk0Var.getAnimatedDrawable().M(40);
        bk0Var.d();
    }
}
