package org.telegram.ui;

import android.content.Context;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f11 extends org.telegram.ui.Components.yu0 {
    public final /* synthetic */ i01 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f11(i01 i01Var, Context context, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, context, f6Var);
        this.G3 = i01Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final boolean D1() {
        return org.telegram.messenger.rc.e(16388) || this.G3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void H1(int i7) {
        super.H1(i7);
        this.G3.d(false);
    }
}
