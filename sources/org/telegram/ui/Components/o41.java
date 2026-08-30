package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-31c59681dc67c50f9c85463306fa4201c22270b60fa73c0aa0aee7d630a89c77 */
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
