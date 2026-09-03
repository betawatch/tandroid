package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class o41 implements pv0 {
    public int a;
    public boolean b;
    public final /* synthetic */ p41 c;

    public o41(p41 p41Var) {
        this.c = p41Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        if (this.a == i10 && this.b == z4) {
            return;
        }
        this.a = i10;
        this.b = z4;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            p41 p41Var = this.c;
            if (p41Var.u0) {
                return;
            }
            p41Var.B0.setAllowNestedScroll(false);
            p41Var.u0 = true;
        }
    }
}
