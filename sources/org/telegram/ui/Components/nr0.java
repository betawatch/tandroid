package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class nr0 extends at0 {
    public final /* synthetic */ gt0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nr0(gt0 gt0Var, Context context) {
        super(gt0Var, context);
        this.h = gt0Var;
    }

    @Override // v4.i0
    public final void f() {
        super.f();
        gt0 gt0Var = this.h;
        bs0 g02 = gt0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        gt0Var.L.f();
    }
}
