package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class ii extends xg {
    public final /* synthetic */ yi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ii(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, yi yiVar) {
        super(i10, context, f6Var, false);
        this.l0 = yiVar;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean e() {
        return !this.l0.U0;
    }

    @Override // org.telegram.ui.Components.xg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.xg
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
