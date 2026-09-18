package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class us0 extends kx0 {
    public final /* synthetic */ kv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public us0(kv0 kv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = kv0Var;
    }

    @Override // org.telegram.ui.Components.kx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
