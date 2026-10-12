package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class r51 implements nw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ s51 c;

    public r51(s51 s51Var) {
        this.c = s51Var;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            s51 s51Var = this.c;
            if (s51Var.x0) {
                return;
            }
            s51Var.E0.setAllowNestedScroll(false);
            s51Var.x0 = true;
        }
    }
}
