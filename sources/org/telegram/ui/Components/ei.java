package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class ei extends vg {
    public final /* synthetic */ ti l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, ti tiVar) {
        super(i10, context, d6Var, false);
        this.l0 = tiVar;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        return !this.l0.X0;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.vg
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
