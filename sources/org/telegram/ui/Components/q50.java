package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class q50 extends z50 {
    public final /* synthetic */ n60 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q50(n60 n60Var, Context context) {
        super(n60Var, context);
        this.d = n60Var;
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
