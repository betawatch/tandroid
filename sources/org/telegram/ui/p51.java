package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class p51 extends org.telegram.ui.Components.ew0 {
    public final /* synthetic */ q51 v3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p51(q51 q51Var, Context context, int i9, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, i9, b6Var);
        this.v3 = q51Var;
    }

    @Override // org.telegram.ui.Components.ew0
    public final boolean A1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.v3.y.S == 4;
    }

    @Override // org.telegram.ui.Components.ew0
    public final void E1(int i9) {
        super.E1(i9);
        this.v3.e(false);
    }
}
