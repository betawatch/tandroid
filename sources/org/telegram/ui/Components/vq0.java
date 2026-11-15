package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class vq0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ ys0 q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(ys0 ys0Var, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, e6Var);
        this.q0 = ys0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i7) {
        return this.q0.h1(i7);
    }
}
