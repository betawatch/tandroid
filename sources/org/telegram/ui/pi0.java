package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class pi0 extends org.telegram.ui.Components.ug {
    public final /* synthetic */ org.telegram.ui.Components.ug l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ cj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(cj0 cj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.ug ugVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.n0 = cj0Var;
        this.l0 = ugVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.ug
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean j() {
        return this.l0.j();
    }
}
