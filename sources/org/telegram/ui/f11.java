package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class f11 extends org.telegram.ui.Components.kv0 {
    public final /* synthetic */ i01 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(i01 i01Var, Context context, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        super(i7, context, i6Var);
        this.H3 = i01Var;
    }

    @Override // org.telegram.ui.Components.kv0
    public final boolean D1() {
        return org.telegram.messenger.pc.e(16388) || this.H3.G.a0 == 4;
    }

    @Override // org.telegram.ui.Components.kv0
    public final void H1(int i7) {
        super.H1(i7);
        this.H3.d(false);
    }
}
