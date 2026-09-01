package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class p41 implements pv0 {
    public int a;
    public boolean b;
    public final /* synthetic */ q41 c;

    public p41(q41 q41Var) {
        this.c = q41Var;
    }

    @Override // org.telegram.ui.Components.pv0
    public final void G(int i10, boolean z4) {
        if (this.a == i10 && this.b == z4) {
            return;
        }
        this.a = i10;
        this.b = z4;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            q41 q41Var = this.c;
            if (q41Var.u0) {
                return;
            }
            q41Var.B0.setAllowNestedScroll(false);
            q41Var.u0 = true;
        }
    }
}
