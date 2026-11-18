package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class w50 extends org.telegram.ui.Cells.a9 {
    public final /* synthetic */ x50 E;
    public final gk x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w50(x50 x50Var, Context context) {
        super(context);
        this.E = x50Var;
        this.x = new gk(this, 9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        gk gkVar = this.x;
        org.telegram.messenger.g0.r(gkVar);
        if (this.y) {
            org.telegram.messenger.g0.h3(gkVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.x);
    }
}
