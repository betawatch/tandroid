package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class vs0 extends kx0 {
    public final /* synthetic */ lv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(lv0 lv0Var, Context context, v00 v00Var) {
        super(context, v00Var, 1, null);
        this.K = lv0Var;
    }

    @Override // org.telegram.ui.Components.kx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
