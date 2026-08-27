package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class ai0 extends org.telegram.ui.Components.hg {
    public final /* synthetic */ org.telegram.ui.Components.hg h0;
    public final /* synthetic */ boolean i0;
    public final /* synthetic */ ni0 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ai0(ni0 ni0Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var, org.telegram.ui.Components.hg hgVar, boolean z10) {
        super(i10, context, c6Var, false);
        this.j0 = ni0Var;
        this.h0 = hgVar;
        this.i0 = z10;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean d() {
        return this.h0.d();
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean e() {
        return this.h0.e();
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean f() {
        return (this.i0 && this.j0.m0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.hg
    public final int getFillColor() {
        return this.h0.getFillColor();
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean j() {
        return this.h0.j();
    }
}
