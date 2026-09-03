package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-4db10a2abc5925f8b2ffba760bede7208ad63f8c4c4a39ddbdd6a4937cbdd1b2 */
/* loaded from: classes3.dex */
public final class n41 implements ov0 {
    public int a;
    public boolean b;
    public final /* synthetic */ o41 c;

    public n41(o41 o41Var) {
        this.c = o41Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void G(int i10, boolean z4) {
        if (this.a == i10 && this.b == z4) {
            return;
        }
        this.a = i10;
        this.b = z4;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            o41 o41Var = this.c;
            if (o41Var.u0) {
                return;
            }
            o41Var.B0.setAllowNestedScroll(false);
            o41Var.u0 = true;
        }
    }
}
