package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class ii0 extends org.telegram.ui.Components.vg {
    public final /* synthetic */ org.telegram.ui.Components.vg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ vi0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii0(vi0 vi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.n0 = vi0Var;
        this.l0 = vgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.vg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean j() {
        return this.l0.j();
    }
}
