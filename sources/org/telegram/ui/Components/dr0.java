package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class dr0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ gt0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dr0(gt0 gt0Var, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i6Var);
        this.q0 = gt0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i7) {
        return this.q0.h1(i7);
    }
}
