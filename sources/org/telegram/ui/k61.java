package org.telegram.ui;

import android.content.Context;
import android.view.View;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class k61 extends rg.c1 {
    public final /* synthetic */ l61 M;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(l61 l61Var, Context context) {
        super(context, 2, null);
        this.M = l61Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        l61 l61Var = this.M;
        if (l61Var.getParent() instanceof View) {
            ((View) l61Var.getParent()).invalidate();
        }
    }
}
