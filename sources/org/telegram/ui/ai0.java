package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ai0 extends org.telegram.ui.Components.vg {
    public final /* synthetic */ org.telegram.ui.Components.vg n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ ni0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, u6Var, false);
        this.p0 = ni0Var;
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
