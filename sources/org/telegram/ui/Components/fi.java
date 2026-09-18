package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class fi extends ug {
    public final /* synthetic */ vi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, vi viVar) {
        super(i10, context, e6Var, false);
        this.l0 = viVar;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean e() {
        return !this.l0.U0;
    }

    @Override // org.telegram.ui.Components.ug
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.ug
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.j6.S5);
    }
}
