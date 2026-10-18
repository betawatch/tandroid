package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class ai0 extends org.telegram.ui.Components.vg {
    public final /* synthetic */ org.telegram.ui.Components.vg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ ni0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.vg vgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.n0 = ni0Var;
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
