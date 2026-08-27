package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class o51 extends org.telegram.ui.Components.gw0 {
    public final /* synthetic */ p51 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o51(p51 p51Var, Context context, int i10, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, c6Var);
        this.v3 = p51Var;
    }

    @Override // org.telegram.ui.Components.gw0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.v3.y.S == 4;
    }

    @Override // org.telegram.ui.Components.gw0
    public final void E1(int i10) {
        super.E1(i10);
        this.v3.e(false);
    }
}
