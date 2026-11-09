package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class vq0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ zs0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vq0(zs0 zs0Var, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, g6Var);
        this.p0 = zs0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i7) {
        return this.p0.h1(i7);
    }
}
