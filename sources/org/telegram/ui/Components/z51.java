package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class z51 implements uw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ a61 c;

    public z51(a61 a61Var) {
        this.c = a61Var;
    }

    @Override // org.telegram.ui.Components.uw0
    public final void I(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            a61 a61Var = this.c;
            if (a61Var.m0) {
                return;
            }
            a61Var.t0.setAllowNestedScroll(false);
            a61Var.m0 = true;
        }
    }
}
