package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
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
