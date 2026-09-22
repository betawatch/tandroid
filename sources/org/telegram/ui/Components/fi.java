package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class fi extends ug {
    public final /* synthetic */ vi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(int i10, Context context, org.telegram.ui.ActionBar.f6 f6Var, vi viVar) {
        super(i10, context, f6Var, false);
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
