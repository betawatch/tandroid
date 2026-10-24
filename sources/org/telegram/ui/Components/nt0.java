package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public final class nt0 extends jv0 {
    public final /* synthetic */ xv0 t0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nt0(xv0 xv0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(xv0Var, context, g6Var);
        this.t0 = xv0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i10) {
        return this.t0.Y0(i10);
    }
}
