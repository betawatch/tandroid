package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class is0 extends yw0 {
    public final /* synthetic */ yu0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is0(yu0 yu0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = yu0Var;
    }

    @Override // org.telegram.ui.Components.yw0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
