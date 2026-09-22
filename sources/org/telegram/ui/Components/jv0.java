package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class jv0 extends iv0 {
    public final /* synthetic */ kv0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jv0(kv0 kv0Var, Context context, int i10) {
        super(kv0Var.e, context, i10, false);
        this.G = kv0Var;
    }

    @Override // org.telegram.ui.Components.iv0, s4.h0
    public final void l() {
        super.l();
        kv0 kv0Var = this.G;
        lv0 lv0Var = kv0Var.e;
        int i10 = kv0Var.a;
        int[] iArr = lv0.d2;
        eu0 W = lv0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            kv0Var.d.l();
        }
        if (W != null) {
            vs0 vs0Var = W.w;
            ai.d9 d9Var = this.s;
            vs0Var.e(d9Var != null && (d9Var.k() || (lv0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
