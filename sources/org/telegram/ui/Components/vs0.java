package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class vs0 extends lx0 {
    public final /* synthetic */ lv0 K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vs0(lv0 lv0Var, Context context, t00 t00Var) {
        super(context, t00Var, 1, null);
        this.K = lv0Var;
    }

    @Override // org.telegram.ui.Components.lx0
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
