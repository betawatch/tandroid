package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class rh extends hg {
    public final /* synthetic */ gi h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rh(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, gi giVar) {
        super(i10, context, c6Var, false);
        this.h0 = giVar;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean e() {
        return !this.h0.Q0;
    }

    @Override // org.telegram.ui.Components.hg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.hg
    public final int getFillColor() {
        return this.h0.getThemedColor(org.telegram.ui.ActionBar.g6.S5);
    }
}
