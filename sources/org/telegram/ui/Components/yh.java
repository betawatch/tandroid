package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class yh extends og {
    public final /* synthetic */ ni h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yh(int i10, Context context, org.telegram.ui.ActionBar.c6 c6Var, ni niVar) {
        super(i10, context, c6Var, false);
        this.h0 = niVar;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean e() {
        return !this.h0.Q0;
    }

    @Override // org.telegram.ui.Components.og
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.og
    public final int getFillColor() {
        return this.h0.getThemedColor(org.telegram.ui.ActionBar.g6.S5);
    }
}
