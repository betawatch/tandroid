package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class fr0 extends ts0 {
    public final /* synthetic */ zs0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fr0(zs0 zs0Var, Context context) {
        super(zs0Var, context);
        this.h = zs0Var;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        zs0 zs0Var = this.h;
        ur0 g02 = zs0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        zs0Var.K.f();
    }
}
