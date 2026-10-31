package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class or0 extends dw0 {
    public final /* synthetic */ zt0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public or0(zt0 zt0Var, Context context, zz zzVar) {
        super(context, zzVar, 1, null);
        this.K = zt0Var;
    }

    @Override // org.telegram.ui.Components.dw0
    public final void a() {
        invalidate();
        this.K.M0();
    }
}
