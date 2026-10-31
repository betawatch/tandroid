package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ah0 extends org.telegram.ui.Components.zf {
    public final /* synthetic */ org.telegram.ui.Components.zf n0;
    public final /* synthetic */ boolean o0;
    public final /* synthetic */ kh0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ah0(kh0 kh0Var, Context context, int i10, org.telegram.ui.ActionBar.p6 p6Var, org.telegram.ui.Components.zf zfVar, boolean z10) {
        super(i10, context, p6Var, false);
        this.p0 = kh0Var;
        this.n0 = zfVar;
        this.o0 = z10;
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean d() {
        return this.n0.d();
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean e() {
        return this.n0.e();
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean f() {
        return (this.o0 && this.p0.p0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.zf
    public final int getFillColor() {
        return this.n0.getFillColor();
    }

    @Override // org.telegram.ui.Components.zf
    public final boolean j() {
        return this.n0.j();
    }
}
