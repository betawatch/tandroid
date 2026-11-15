package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class a21 implements View.OnClickListener {
    public final /* synthetic */ i21 a;

    public a21(i21 i21Var) {
        this.a = i21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.fh0 fh0Var = this.a.o1;
        if (fh0Var.b() || fh0Var.getAnimatedDrawable() == null) {
            return;
        }
        fh0Var.getAnimatedDrawable().M(40);
        fh0Var.d();
    }
}
