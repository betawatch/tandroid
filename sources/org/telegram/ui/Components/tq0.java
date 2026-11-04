package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class tq0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ ws0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(ws0 ws0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.q0 = ws0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i3) {
        return this.q0.f1(i3);
    }
}
