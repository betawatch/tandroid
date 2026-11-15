package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class o50 extends org.telegram.ui.Cells.y8 {
    public final /* synthetic */ p50 E;
    public final zj x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o50(p50 p50Var, Context context) {
        super(context);
        this.E = p50Var;
        this.x = new zj(this, 9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        zj zjVar = this.x;
        org.telegram.messenger.g0.r(zjVar);
        if (this.y) {
            org.telegram.messenger.g0.i3(zjVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.x);
    }
}
