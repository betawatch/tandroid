package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class dr0 extends qs0 {
    public final /* synthetic */ ws0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(ws0 ws0Var, Context context) {
        super(ws0Var, context);
        this.h = ws0Var;
    }

    @Override // u4.h0
    public final void f() {
        super.f();
        ws0 ws0Var = this.h;
        rr0 g02 = ws0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        ws0Var.L.f();
    }
}
