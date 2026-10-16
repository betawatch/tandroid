package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class ht0 extends wx0 {
    public final /* synthetic */ xv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ht0(xv0 xv0Var, Context context, f10 f10Var) {
        super(context, f10Var, 1, null);
        this.K = xv0Var;
    }

    @Override // org.telegram.ui.Components.wx0
    public final void a() {
        invalidate();
        this.K.F0();
    }
}
