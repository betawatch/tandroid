package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-512d310aee599d224f4c0b0a2d01feec484432ddc9f55a7433fffe3405d6493d */
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
