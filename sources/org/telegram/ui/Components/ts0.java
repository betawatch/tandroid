package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class ts0 extends ix0 {
    public final /* synthetic */ jv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ts0(jv0 jv0Var, Context context, u00 u00Var) {
        super(context, u00Var, 1, null);
        this.K = jv0Var;
    }

    @Override // org.telegram.ui.Components.ix0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
