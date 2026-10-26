package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
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
