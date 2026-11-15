package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
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
