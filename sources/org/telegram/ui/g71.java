package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class g71 implements View.OnClickListener {
    public final /* synthetic */ p71 a;

    public g71(p71 p71Var) {
        this.a = p71Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.lj0 lj0Var = this.a.d;
        if (lj0Var.b() || lj0Var.getAnimatedDrawable() == null) {
            return;
        }
        lj0Var.getAnimatedDrawable().K(40);
        lj0Var.d();
    }
}
