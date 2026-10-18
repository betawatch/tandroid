package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n61 implements View.OnClickListener {
    public final /* synthetic */ w61 a;

    public n61(w61 w61Var) {
        this.a = w61Var;
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
