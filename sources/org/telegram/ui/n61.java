package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n61 extends org.telegram.ui.Components.vw0 {
    public final /* synthetic */ o61 z3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n61(o61 o61Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.z3 = o61Var;
    }

    @Override // org.telegram.ui.Components.vw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.z3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void E1(int i10) {
        super.E1(i10);
        this.z3.d(false);
    }
}
