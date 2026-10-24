package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
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
