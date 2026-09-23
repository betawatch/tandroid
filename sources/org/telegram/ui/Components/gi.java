package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class gi extends ug {
    public final /* synthetic */ wi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gi(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, wi wiVar) {
        super(i10, context, d6Var, false);
        this.l0 = wiVar;
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
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.h6.S5);
    }
}
