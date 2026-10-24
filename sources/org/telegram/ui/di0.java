package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class di0 extends org.telegram.ui.Components.vg {
    public final /* synthetic */ org.telegram.ui.Components.vg n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ qi0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public di0(qi0 qi0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, g6Var, false);
        this.p0 = qi0Var;
        this.n0 = vgVar;
        this.o0 = z10;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean d() {
        return this.n0.d();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        return this.n0.e();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        return (this.o0 && this.p0.p0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.vg
    public final int getFillColor() {
        return this.n0.getFillColor();
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean j() {
        return this.n0.j();
    }
}
