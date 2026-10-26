package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ut0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ aw0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ut0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, u6Var);
        this.p0 = aw0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i10) {
        return this.p0.b1(i10);
    }
}
