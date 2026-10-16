package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class s51 implements nw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ t51 c;

    public s51(t51 t51Var) {
        this.c = t51Var;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            t51 t51Var = this.c;
            if (t51Var.x0) {
                return;
            }
            t51Var.E0.setAllowNestedScroll(false);
            t51Var.x0 = true;
        }
    }
}
