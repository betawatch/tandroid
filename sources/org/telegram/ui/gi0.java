package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class gi0 extends org.telegram.ui.Components.lg {
    public final /* synthetic */ org.telegram.ui.Components.lg i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ ti0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi0(ti0 ti0Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var, org.telegram.ui.Components.lg lgVar, boolean z4) {
        super(i10, context, g6Var, false);
        this.k0 = ti0Var;
        this.i0 = lgVar;
        this.j0 = z4;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean d() {
        return this.i0.d();
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        return this.i0.e();
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        return (this.j0 && this.k0.n0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.lg
    public final int getFillColor() {
        return this.i0.getFillColor();
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean j() {
        return this.i0.j();
    }
}
