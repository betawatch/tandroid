package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class f71 implements View.OnClickListener {
    public final /* synthetic */ o71 a;

    public f71(o71 o71Var) {
        this.a = o71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.jj0 jj0Var = this.a.d;
        if (jj0Var.b() || jj0Var.getAnimatedDrawable() == null) {
            return;
        }
        jj0Var.getAnimatedDrawable().K(40);
        jj0Var.d();
    }
}
