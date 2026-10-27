package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class vt0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ bw0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vt0(bw0 bw0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.p0 = bw0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i10) {
        return this.p0.b1(i10);
    }
}
