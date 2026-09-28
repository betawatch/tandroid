package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c7458e893fd6f3e0a6fbf27724068aa00f1caa233b10a33d542967499303009b */
/* loaded from: classes3.dex */
public final class gi extends vg {
    public final /* synthetic */ wi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(i10, context, d6Var, false);
        this.l0 = wiVar;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.vg
    public final boolean e() {
        return !this.l0.U0;
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
