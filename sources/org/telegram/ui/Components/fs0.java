package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class fs0 extends ut0 {
    public final /* synthetic */ au0 h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fs0(au0 au0Var, Context context) {
        super(au0Var, context);
        this.h = au0Var;
    }

    @Override // s4.g0
    public final void f() {
        super.f();
        au0 au0Var = this.h;
        ts0 f02 = au0Var.f0(0);
        if (f02 == null || f02.n.getVisibility() != 0) {
            return;
        }
        au0Var.K.f();
    }
}
