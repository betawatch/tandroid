package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class at0 extends ux0 {
    public final /* synthetic */ qv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public at0(qv0 qv0Var, Context context, w00 w00Var) {
        super(context, w00Var, 1, null);
        this.K = qv0Var;
    }

    @Override // org.telegram.ui.Components.ux0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
