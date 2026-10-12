package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class fi extends wg {
    public final /* synthetic */ vi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, vi viVar) {
        super(i10, context, c6Var, false);
        this.l0 = viVar;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean e() {
        return !this.l0.X0;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.wg
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.g6.S5);
    }
}
