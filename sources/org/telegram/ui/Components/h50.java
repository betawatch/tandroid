package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class h50 extends org.telegram.ui.Cells.y8 {
    public final /* synthetic */ i50 E;
    public final lt x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h50(i50 i50Var, Context context) {
        super(context);
        this.E = i50Var;
        this.x = new lt(this, 5);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        lt ltVar = this.x;
        org.telegram.messenger.g0.r(ltVar);
        if (this.y) {
            org.telegram.messenger.g0.i3(ltVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.x);
    }
}
