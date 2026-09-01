package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class vh extends lg {
    public final /* synthetic */ mi i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vh(int i10, Context context, org.telegram.ui.ActionBar.g6 g6Var, mi miVar) {
        super(i10, context, g6Var, false);
        this.i0 = miVar;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean d() {
        return false;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean e() {
        return !this.i0.R0;
    }

    @Override // org.telegram.ui.Components.lg
    public final boolean f() {
        return true;
    }

    @Override // org.telegram.ui.Components.lg
    public final int getFillColor() {
        return this.i0.getThemedColor(org.telegram.ui.ActionBar.k6.S5);
    }
}
