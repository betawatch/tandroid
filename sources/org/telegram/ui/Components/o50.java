package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
