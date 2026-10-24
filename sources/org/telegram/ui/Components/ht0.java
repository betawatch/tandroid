package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class ht0 extends wx0 {
    public final /* synthetic */ xv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(xv0 xv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = xv0Var;
    }

    @Override // org.telegram.ui.Components.wx0
    public final void a() {
        invalidate();
        this.K.H0();
    }
}
