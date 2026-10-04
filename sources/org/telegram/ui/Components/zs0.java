package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class zs0 extends tx0 {
    public final /* synthetic */ pv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zs0(pv0 pv0Var, Context context, w00 w00Var) {
        super(context, w00Var, 1, null);
        this.K = pv0Var;
    }

    @Override // org.telegram.ui.Components.tx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
