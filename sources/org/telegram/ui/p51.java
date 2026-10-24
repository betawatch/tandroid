package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-c2fac2ff6f25604a37f332f14748b89ed7ba229f932f7975631b3a2c3d1bec2f */
/* loaded from: classes3.dex */
public final class p51 extends org.telegram.ui.Components.ux0 {
    public final /* synthetic */ q51 A3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(q51 q51Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.A3 = q51Var;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean G1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.A3.F.W == 4;
    }

    @Override // org.telegram.ui.Components.ux0
    public final void K1(int i10) {
        super.K1(i10);
        this.A3.d(false);
    }
}
