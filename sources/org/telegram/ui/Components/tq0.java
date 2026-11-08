package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class tq0 extends ScrollSlidingTextTabStrip {
    public final /* synthetic */ xs0 p0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tq0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, f6Var);
        this.p0 = xs0Var;
    }

    @Override // org.telegram.ui.Components.ScrollSlidingTextTabStrip
    public final int e(int i7) {
        return this.p0.f1(i7);
    }
}
