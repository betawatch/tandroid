package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
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
