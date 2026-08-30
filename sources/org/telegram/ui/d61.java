package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
/* loaded from: classes3.dex */
public final class d61 extends org.telegram.ui.Components.xw0 {
    public final /* synthetic */ e61 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(e61 e61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
        this.w3 = e61Var;
    }

    @Override // org.telegram.ui.Components.xw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.w3.y.T == 4;
    }

    @Override // org.telegram.ui.Components.xw0
    public final void E1(int i10) {
        super.E1(i10);
        this.w3.d(false);
    }
}
