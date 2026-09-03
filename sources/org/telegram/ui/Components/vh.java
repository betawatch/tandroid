package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
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
