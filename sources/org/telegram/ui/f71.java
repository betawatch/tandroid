package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class f71 extends org.telegram.ui.Components.ux0 {
    public final /* synthetic */ g71 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f71(g71 g71Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.x3 = g71Var;
    }

    @Override // org.telegram.ui.Components.ux0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.x3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.ux0
    public final void F1(int i10) {
        super.F1(i10);
        this.x3.e(false);
    }
}
