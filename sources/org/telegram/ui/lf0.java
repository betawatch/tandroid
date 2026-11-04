package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class lf0 extends org.telegram.ui.Components.bg {
    public final /* synthetic */ org.telegram.ui.Components.bg o0;
    public final /* synthetic */ boolean p0;
    public final /* synthetic */ vf0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lf0(vf0 vf0Var, Context context, int i3, org.telegram.ui.ActionBar.e6 e6Var, org.telegram.ui.Components.bg bgVar, boolean z10) {
        super(i3, context, e6Var, false);
        this.q0 = vf0Var;
        this.o0 = bgVar;
        this.p0 = z10;
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean b() {
        return this.o0.b();
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean c() {
        return this.o0.c();
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean d() {
        return (this.p0 && this.q0.q0 && this.r <= 0) ? false : true;
    }

    @Override // org.telegram.ui.Components.bg
    public final int getFillColor() {
        return this.o0.getFillColor();
    }

    @Override // org.telegram.ui.Components.bg
    public final boolean j() {
        return this.o0.j();
    }
}
