package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f163cae349fa37df9d9efb188e844742dfa8f0bb6d7b32f72fe7fb477fc918c */
/* loaded from: classes3.dex */
public final class f21 implements View.OnClickListener {
    public final /* synthetic */ n21 a;

    public f21(n21 n21Var) {
        this.a = n21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.rh0 rh0Var = this.a.o1;
        if (rh0Var.b() || rh0Var.getAnimatedDrawable() == null) {
            return;
        }
        rh0Var.getAnimatedDrawable().M(40);
        rh0Var.d();
    }
}
