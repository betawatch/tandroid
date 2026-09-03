package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class hi0 extends org.telegram.ui.Components.lg {
    public final /* synthetic */ org.telegram.ui.Components.lg i0;
    public final /* synthetic */ boolean j0;
    public final /* synthetic */ ui0 k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hi0(ui0 ui0Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var, org.telegram.ui.Components.lg lgVar, boolean z4) {
        super(i10, context, f6Var, false);
        this.k0 = ui0Var;
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
