package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-09da8b159cf36792e88674cebe3dc77c7407e16cea1bdebcb1e8ccd47061bd65 */
/* loaded from: classes3.dex */
public final class fi extends vg {
    public final /* synthetic */ vi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(i10, context, f6Var, false);
        this.l0 = viVar;
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
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
