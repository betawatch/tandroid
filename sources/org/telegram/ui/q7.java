package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class q7 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ l7 m0;
    public final /* synthetic */ r7 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q7(r7 r7Var, Context context, l7 l7Var) {
        super(0, context, null);
        this.n0 = r7Var;
        this.m0 = l7Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final void a() {
        u7 u7Var = this.n0.n;
        l7 l7Var = this.m0;
        u7.b(u7Var, (di.b) l7Var.getTag(), l7Var);
    }
}
