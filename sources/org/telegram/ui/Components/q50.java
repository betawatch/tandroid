package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class q50 extends z50 {
    public final /* synthetic */ m60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(m60 m60Var, Context context) {
        super(m60Var, context);
        this.d = m60Var;
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
