package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
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
