package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class l50 extends org.telegram.ui.Cells.z8 {
    public final /* synthetic */ m50 D;
    public final dt x;
    public boolean y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l50(m50 m50Var, Context context) {
        super(context);
        this.D = m50Var;
        this.x = new dt(this, 6);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        dt dtVar = this.x;
        org.telegram.messenger.g0.r(dtVar);
        if (this.y) {
            org.telegram.messenger.g0.i3(dtVar, 500L);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        org.telegram.messenger.g0.r(this.x);
    }
}
