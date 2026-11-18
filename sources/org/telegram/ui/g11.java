package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class g11 extends org.telegram.ui.Components.iv0 {
    public final /* synthetic */ j01 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(j01 j01Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.H3 = j01Var;
    }

    @Override // org.telegram.ui.Components.iv0
    public final boolean D1() {
        return org.telegram.messenger.pc.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // org.telegram.ui.Components.iv0
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}
