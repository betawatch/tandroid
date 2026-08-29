package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class c41 implements gv0 {
    public int a;
    public boolean b;
    public final /* synthetic */ d41 c;

    public c41(d41 d41Var) {
        this.c = d41Var;
    }

    @Override // org.telegram.ui.Components.gv0
    public final void G(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            d41 d41Var = this.c;
            if (d41Var.t0) {
                return;
            }
            d41Var.A0.setAllowNestedScroll(false);
            d41Var.t0 = true;
        }
    }
}
