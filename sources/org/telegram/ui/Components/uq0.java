package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class uq0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ ys0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, h6Var);
        this.p0 = ys0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i7) {
        return this.p0.h1(i7);
    }
}
