package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class q61 extends org.telegram.ui.Components.rx0 {
    public final /* synthetic */ r61 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q61(r61 r61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.G3 = r61Var;
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean C1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.G3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.rx0
    public final void G1(int i10) {
        super.G1(i10);
        this.G3.d(false);
    }
}
