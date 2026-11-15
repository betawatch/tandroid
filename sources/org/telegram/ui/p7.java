package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class p7 extends org.telegram.ui.Cells.f7 {
    public final /* synthetic */ k7 m0;
    public final /* synthetic */ q7 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p7(q7 q7Var, Context context, k7 k7Var) {
        super(0, context, null);
        this.n0 = q7Var;
        this.m0 = k7Var;
    }

    @Override // org.telegram.ui.Cells.f7
    public final void a() {
        t7 t7Var = this.n0.n;
        k7 k7Var = this.m0;
        t7.b(t7Var, (ei.b) k7Var.getTag(), k7Var);
    }
}
