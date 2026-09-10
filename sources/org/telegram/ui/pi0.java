package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class pi0 extends org.telegram.ui.Components.xg {
    public final /* synthetic */ org.telegram.ui.Components.xg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ cj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.xg xgVar, boolean z10) {
        super(i10, context, f6Var, false);
        this.n0 = cj0Var;
        this.l0 = xgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.xg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean j() {
        return this.l0.j();
    }
}
