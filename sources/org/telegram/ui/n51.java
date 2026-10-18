package org.telegram.ui;

import android.content.Context;
import org.telegram.messenger.LiteMode;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class n51 extends org.telegram.ui.Components.px0 {
    public final /* synthetic */ o51 x3;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n51(o51 o51Var, Context context, int i10, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, d6Var);
        this.x3 = o51Var;
    }

    @Override // org.telegram.ui.Components.px0
    public final boolean B1() {
        return LiteMode.isEnabled(LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD) || this.x3.y.W == 4;
    }

    @Override // org.telegram.ui.Components.px0
    public final void F1(int i10) {
        super.F1(i10);
        this.x3.e(false);
    }
}
