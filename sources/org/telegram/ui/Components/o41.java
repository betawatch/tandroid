package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class o41 implements ov0 {
    public int a;
    public boolean b;
    public final /* synthetic */ p41 c;

    public o41(p41 p41Var) {
        this.c = p41Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            p41 p41Var = this.c;
            if (p41Var.x0) {
                return;
            }
            p41Var.E0.setAllowNestedScroll(false);
            p41Var.x0 = true;
        }
    }
}
