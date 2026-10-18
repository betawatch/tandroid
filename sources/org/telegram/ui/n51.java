package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class n51 extends org.telegram.ui.Components.px0 {
    public final /* synthetic */ o51 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(o51 o51Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.x3 = o51Var;
    }

    @Override // org.telegram.ui.Components.px0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.x3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.px0
    public final void F1(int i10) {
        super.F1(i10);
        this.x3.e(false);
    }
}
