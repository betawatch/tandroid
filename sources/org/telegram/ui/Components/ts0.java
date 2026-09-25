package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53901c404a1b0373a5bf33e44ab631b007d629dadc71f62a8c7dd35781185007 */
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
