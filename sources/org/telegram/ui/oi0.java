package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class oi0 extends org.telegram.ui.Components.tg {
    public final /* synthetic */ org.telegram.ui.Components.tg l0;
    public final /* synthetic */ boolean m0;
    public final /* synthetic */ bj0 n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oi0(bj0 bj0Var, Context context, int i10, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.tg tgVar, boolean z10) {
        super(i10, context, e6Var, false);
        this.n0 = bj0Var;
        this.l0 = tgVar;
        this.m0 = z10;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean d() {
        return this.l0.d();
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean e() {
        return this.l0.e();
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean f() {
        return (this.m0 && this.n0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.tg
    public final int getFillColor() {
        return this.l0.getFillColor();
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean j() {
        return this.l0.j();
    }
}
