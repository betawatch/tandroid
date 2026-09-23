package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n71 implements View.OnClickListener {
    public final /* synthetic */ w71 a;

    public n71(w71 w71Var) {
        this.a = w71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.bj0 bj0Var = this.a.d;
        if (bj0Var.b() || bj0Var.getAnimatedDrawable() == null) {
            return;
        }
        bj0Var.getAnimatedDrawable().M(40);
        bj0Var.d();
    }
}
