package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
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
