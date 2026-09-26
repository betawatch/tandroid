package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class p7 extends org.telegram.ui.Cells.j7 {
    public final /* synthetic */ k7 l0;
    public final /* synthetic */ q7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(q7 q7Var, Context context, k7 k7Var) {
        super(context, 0, null);
        this.m0 = q7Var;
        this.l0 = k7Var;
    }

    @Override // org.telegram.ui.Cells.j7
    public final void a() {
        s7 s7Var = this.m0.n;
        k7 k7Var = this.l0;
        s7.b(s7Var, (zh.a) k7Var.getTag(), k7Var);
    }
}
