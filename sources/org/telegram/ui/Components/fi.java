package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class fi extends tg {
    public final /* synthetic */ vi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fi(int i10, Context context, org.telegram.ui.ActionBar.e6 e6Var, vi viVar) {
        super(i10, context, e6Var, false);
        this.l0 = viVar;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean e() {
        return !this.l0.U0;
    }

    @Override // org.telegram.ui.Components.tg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.tg
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.i6.S5);
    }
}
