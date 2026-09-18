package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class g50 extends o50 {
    public final /* synthetic */ b60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g50(b60 b60Var, Context context) {
        super(b60Var, context);
        this.d = b60Var;
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
