package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class p41 implements pv0 {
    public int a;
    public boolean b;
    public final /* synthetic */ q41 c;

    public p41(q41 q41Var) {
        this.c = q41Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            q41 q41Var = this.c;
            if (q41Var.x0) {
                return;
            }
            q41Var.E0.setAllowNestedScroll(false);
            q41Var.x0 = true;
        }
    }
}
