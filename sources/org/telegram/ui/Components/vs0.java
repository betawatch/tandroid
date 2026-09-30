package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class vs0 extends kx0 {
    public final /* synthetic */ lv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(lv0 lv0Var, Context context, v00 v00Var) {
        super(context, v00Var, 1, null);
        this.K = lv0Var;
    }

    @Override // org.telegram.ui.Components.kx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
