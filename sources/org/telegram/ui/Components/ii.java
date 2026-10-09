package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class ii extends xg {
    public final /* synthetic */ yi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, yi yiVar) {
        super(i10, context, e6Var, false);
        this.l0 = yiVar;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean e() {
        return !this.l0.X0;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.xg
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.i6.S5);
    }
}
