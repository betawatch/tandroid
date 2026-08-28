package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p61 implements View.OnClickListener {
    public final /* synthetic */ y61 a;

    public p61(y61 y61Var) {
        this.a = y61Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.pi0 pi0Var = this.a.d;
        if (pi0Var.b() || pi0Var.getAnimatedDrawable() == null) {
            return;
        }
        pi0Var.getAnimatedDrawable().K(40);
        pi0Var.d();
    }
}
