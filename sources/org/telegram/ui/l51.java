package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class l51 extends org.telegram.ui.Components.rx0 {
    public final /* synthetic */ m51 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l51(m51 m51Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.x3 = m51Var;
    }

    @Override // org.telegram.ui.Components.rx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.x3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.rx0
    public final void F1(int i10) {
        super.F1(i10);
        this.x3.e(false);
    }
}
