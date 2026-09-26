package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-8159789691d0b3bb0641ef1f4646484974d69719884d0b33e845acec3d7c3062 */
/* loaded from: classes3.dex */
public final class o61 extends org.telegram.ui.Components.gx0 {
    public final /* synthetic */ p61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o61(p61 p61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.z3 = p61Var;
    }

    @Override // org.telegram.ui.Components.gx0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.gx0
    public final void E1(int i10) {
        super.E1(i10);
        this.z3.d(false);
    }
}
