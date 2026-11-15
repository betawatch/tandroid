package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final class fr0 extends ss0 {
    public final /* synthetic */ ys0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(ys0 ys0Var, Context context) {
        super(ys0Var, context);
        this.h = ys0Var;
    }

    @Override // v4.h0
    public final void f() {
        super.f();
        ys0 ys0Var = this.h;
        tr0 g02 = ys0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        ys0Var.L.f();
    }
}
