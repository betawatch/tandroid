package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class f61 extends org.telegram.ui.Components.yw0 {
    public final /* synthetic */ g61 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(g61 g61Var, Context context, int i10, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i10, g6Var);
        this.w3 = g61Var;
    }

    @Override // org.telegram.ui.Components.yw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.w3.y.T == 4;
    }

    @Override // org.telegram.ui.Components.yw0
    public final void E1(int i10) {
        super.E1(i10);
        this.w3.d(false);
    }
}
