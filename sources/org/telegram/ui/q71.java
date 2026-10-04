package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class q71 implements View.OnClickListener {
    public final /* synthetic */ z71 a;

    public q71(z71 z71Var) {
        this.a = z71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.nj0 nj0Var = this.a.d;
        if (nj0Var.b() || nj0Var.getAnimatedDrawable() == null) {
            return;
        }
        nj0Var.getAnimatedDrawable().M(40);
        nj0Var.d();
    }
}
