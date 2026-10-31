package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class p7 extends org.telegram.ui.Cells.k7 {
    public final /* synthetic */ k7 l0;
    public final /* synthetic */ q7 m0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(q7 q7Var, Context context, k7 k7Var) {
        super(0, context, null);
        this.m0 = q7Var;
        this.l0 = k7Var;
    }

    @Override // org.telegram.ui.Cells.k7
    public final void a() {
        t7 t7Var = this.m0.n;
        k7 k7Var = this.l0;
        t7.b(t7Var, (sh.a) k7Var.getTag(), k7Var);
    }
}
