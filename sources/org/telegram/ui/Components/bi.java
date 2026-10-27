package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class bi extends vg {
    public final /* synthetic */ ti n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bi(int i10, Context context, org.telegram.ui.ActionBar.u6 u6Var, ti tiVar) {
        super(i10, context, u6Var, false);
        this.n0 = tiVar;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        return !this.n0.X0;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.vg
    public final int getFillColor() {
        return this.n0.getThemedColor(org.telegram.ui.ActionBar.y6.S5);
    }
}
