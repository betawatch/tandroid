package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class mi0 extends org.telegram.ui.Components.wg {
    public final /* synthetic */ org.telegram.ui.Components.wg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ zi0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mi0(zi0 zi0Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var, org.telegram.ui.Components.wg wgVar, boolean z10) {
        super(i10, context, d6Var, false);
        this.n0 = zi0Var;
        this.l0 = wgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.wg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean j() {
        return this.l0.j();
    }
}
