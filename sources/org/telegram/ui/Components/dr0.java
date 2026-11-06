package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-b660391305224b02968ff30c453f6c938c4db5712846d0adb86e223f946c9ae5 */
/* loaded from: classes3.dex */
public final class dr0 extends rs0 {
    public final /* synthetic */ xs0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(xs0 xs0Var, Context context) {
        super(xs0Var, context);
        this.h = xs0Var;
    }

    @Override // v4.g0
    public final void f() {
        super.f();
        xs0 xs0Var = this.h;
        sr0 g02 = xs0Var.g0(0);
        if (g02 == null || g02.n.getVisibility() != 0) {
            return;
        }
        xs0Var.K.f();
    }
}
