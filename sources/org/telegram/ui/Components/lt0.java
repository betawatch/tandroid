package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class lt0 extends ay0 {
    public final /* synthetic */ bw0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lt0(bw0 bw0Var, Context context, j10 j10Var) {
        super(context, j10Var, 1, null);
        this.K = bw0Var;
    }

    @Override // org.telegram.ui.Components.ay0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
