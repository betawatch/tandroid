package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class q7 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ l7 l0;
    public final /* synthetic */ r7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(r7 r7Var, Context context, l7 l7Var) {
        super(context, 0, null);
        this.m0 = r7Var;
        this.l0 = l7Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a() {
        t7 t7Var = this.m0.n;
        l7 l7Var = this.l0;
        t7.b(t7Var, (zh.a) l7Var.getTag(), l7Var);
    }
}
