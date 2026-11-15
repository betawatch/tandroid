package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class pq0 extends cv0 {
    public final /* synthetic */ ys0 L;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pq0(ys0 ys0Var, Context context, pz pzVar) {
        super(context, pzVar, 1, null);
        this.L = ys0Var;
    }

    @Override // org.telegram.ui.Components.cv0
    public final void a() {
        invalidate();
        this.L.Q0();
    }
}
