package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class dt0 extends sx0 {
    public final /* synthetic */ tv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dt0(tv0 tv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = tv0Var;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void a() {
        invalidate();
        this.K.G0();
    }
}
