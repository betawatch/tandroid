package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class k61 extends org.telegram.ui.Components.xw0 {
    public final /* synthetic */ l61 w3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k61(l61 l61Var, Context context, int i10, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, f6Var);
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
