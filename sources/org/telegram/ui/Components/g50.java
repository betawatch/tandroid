package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class g50 extends p50 {
    public final /* synthetic */ w50 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(w50 w50Var, Context context) {
        super(w50Var, context);
        this.d = w50Var;
    }

    @Override // android.view.View
    public final void setAlpha(float f7) {
        super.setAlpha(f7);
        this.d.invalidate();
    }

    @Override // android.view.View
    public final void setRotationY(float f7) {
        super.setRotationY(f7);
        this.d.invalidate();
    }
}
