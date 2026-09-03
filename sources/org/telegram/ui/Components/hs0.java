package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hs0 extends zw0 {
    public final /* synthetic */ yu0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hs0(yu0 yu0Var, Context context, u00 u00Var) {
        super(context, u00Var, 1, null);
        this.H = yu0Var;
    }

    @Override // org.telegram.ui.Components.zw0
    public final void a() {
        invalidate();
        this.H.E0();
    }
}
