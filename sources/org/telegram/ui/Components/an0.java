package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class an0 extends zf.z {
    public final /* synthetic */ org.telegram.ui.zx I0;
    public final /* synthetic */ Context J0;
    public final /* synthetic */ org.telegram.ui.jx K0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an0(org.telegram.ui.jx jxVar, Context context, org.telegram.ui.zx zxVar, int i10, int i11, s4.j jVar, boolean z10, org.telegram.ui.zx zxVar2, Context context2) {
        super(context, zxVar, i10, i11, jVar, z10);
        this.K0 = jxVar;
        this.I0 = zxVar2;
        this.J0 = context2;
    }

    @Override // s4.g0
    public final void f() {
        ag.b1 b1Var;
        int i10 = this.B0;
        super.f();
        org.telegram.ui.jx jxVar = this.K0;
        if (!jxVar.K0 && (b1Var = jxVar.a0) != null) {
            b1Var.v0(0);
            jxVar.K0 = true;
        }
        if (b() != 0 || i10 == 0 || this.D0 > 0) {
            return;
        }
        jxVar.b0.e(false, false);
    }
}
