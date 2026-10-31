package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ur0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ zt0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ur0(zt0 zt0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.p0 = zt0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i10) {
        return this.p0.c1(i10);
    }
}
