package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class o61 extends org.telegram.ui.Components.sx0 {
    public final /* synthetic */ p61 G3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.G3 = p61Var;
    }

    @Override // org.telegram.ui.Components.sx0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.G3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.sx0
    public final void F1(int i10) {
        super.F1(i10);
        this.G3.d(false);
    }
}
