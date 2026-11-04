package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class bm0 extends kg.e0 {
    public final /* synthetic */ org.telegram.ui.uw J0;
    public final /* synthetic */ Context K0;
    public final /* synthetic */ org.telegram.ui.cw L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm0(org.telegram.ui.cw cwVar, Context context, org.telegram.ui.uw uwVar, int i3, int i10, u4.k kVar, boolean z10, org.telegram.ui.uw uwVar2, Context context2) {
        super(context, uwVar, i3, i10, kVar, z10);
        this.L0 = cwVar;
        this.J0 = uwVar2;
        this.K0 = context2;
    }

    @Override // u4.h0
    public final void f() {
        ci.j1 j1Var;
        int i3 = this.C0;
        super.f();
        org.telegram.ui.cw cwVar = this.L0;
        if (!cwVar.L0 && (j1Var = cwVar.b0) != null) {
            j1Var.v0(0);
            cwVar.L0 = true;
        }
        if (b() != 0 || i3 == 0 || this.E0 > 0) {
            return;
        }
        cwVar.c0.e(false, false);
    }
}
