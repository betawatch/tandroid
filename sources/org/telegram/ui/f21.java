package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class f21 implements View.OnClickListener {
    public final /* synthetic */ n21 a;

    public f21(n21 n21Var) {
        this.a = n21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.dh0 dh0Var = this.a.k1;
        if (dh0Var.b() || dh0Var.getAnimatedDrawable() == null) {
            return;
        }
        dh0Var.getAnimatedDrawable().M(40);
        dh0Var.d();
    }
}
