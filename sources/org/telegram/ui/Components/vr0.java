package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class vr0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ au0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vr0(au0 au0Var, Context context, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, p6Var);
        this.p0 = au0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i10) {
        return this.p0.d1(i10);
    }
}
