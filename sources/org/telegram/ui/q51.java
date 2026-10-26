package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class q51 extends org.telegram.ui.Components.by0 {
    public final /* synthetic */ r51 H3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q51(r51 r51Var, Context context, int i10, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, i10, u6Var);
        this.H3 = r51Var;
    }

    @Override // org.telegram.ui.Components.by0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.H3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.by0
    public final void K1(int i10) {
        super.K1(i10);
        this.H3.d(false);
    }
}
