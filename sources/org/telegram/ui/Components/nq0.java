package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class nq0 extends zu0 {
    public final /* synthetic */ ws0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nq0(ws0 ws0Var, Context context, iz izVar) {
        super(context, izVar, 1, null);
        this.L = ws0Var;
    }

    @Override // org.telegram.ui.Components.zu0
    public final void a() {
        invalidate();
        this.L.P0();
    }
}
