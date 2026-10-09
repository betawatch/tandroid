package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class zv0 extends yv0 {
    public final /* synthetic */ aw0 G;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zv0(aw0 aw0Var, Context context, int i10) {
        super(aw0Var.e, context, i10, false);
        this.G = aw0Var;
    }

    @Override // org.telegram.ui.Components.yv0, s4.i0
    public final void l() {
        super.l();
        aw0 aw0Var = this.G;
        bw0 bw0Var = aw0Var.e;
        int i10 = aw0Var.a;
        int[] iArr = bw0.d2;
        uu0 W = bw0Var.W(i10);
        if (W != null && W.r.getVisibility() == 0) {
            aw0Var.d.l();
        }
        if (W != null) {
            lt0 lt0Var = W.w;
            ai.e9 e9Var = this.s;
            lt0Var.e(e9Var != null && (e9Var.k() || (bw0Var.i0() && this.s.g() > 0)), true);
        }
    }
}
