package org.telegram.ui;

import android.view.View;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class d21 implements View.OnClickListener {
    public final /* synthetic */ l21 a;

    public d21(l21 l21Var) {
        this.a = l21Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        org.telegram.ui.Components.qh0 qh0Var = this.a.o1;
        if (qh0Var.b() || qh0Var.getAnimatedDrawable() == null) {
            return;
        }
        qh0Var.getAnimatedDrawable().M(40);
        qh0Var.d();
    }
}
