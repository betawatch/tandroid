package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class k61 extends org.telegram.ui.Components.xw0 {
    public final /* synthetic */ l61 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(l61 l61Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.w3 = l61Var;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void D1(int i10) {
        super.D1(i10);
        this.w3.d(false);
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean z1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.w3.y.T == 4;
    }
}
