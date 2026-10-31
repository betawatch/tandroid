package jg;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class b3 extends t0 {
    public final /* synthetic */ d3 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b3(d3 d3Var, Context context, float f7) {
        super(context, f7);
        this.t0 = d3Var;
    }

    @Override // android.view.View
    public final void invalidate() {
        this.t0.d.invalidate();
        super.invalidate();
    }
}
