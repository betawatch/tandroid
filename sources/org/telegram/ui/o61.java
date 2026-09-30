package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class o61 extends org.telegram.ui.Components.ix0 {
    public final /* synthetic */ p61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.z3 = p61Var;
    }

    @Override // org.telegram.ui.Components.ix0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.ix0
    public final void E1(int i10) {
        super.E1(i10);
        this.z3.d(false);
    }
}
