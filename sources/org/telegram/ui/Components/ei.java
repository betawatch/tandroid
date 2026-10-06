package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ei extends wg {
    public final /* synthetic */ xi l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ei(int i10, Context context, org.telegram.ui.ActionBar.d6 d6Var, xi xiVar) {
        super(i10, context, d6Var, false);
        this.l0 = xiVar;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean e() {
        return !this.l0.U0;
    }

    @Override // org.telegram.ui.Components.wg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.wg
    public final int getFillColor() {
        return this.l0.getThemedColor(org.telegram.ui.ActionBar.i6.S5);
    }
}
