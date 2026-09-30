package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class d51 implements bw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ e51 c;

    public d51(e51 e51Var) {
        this.c = e51Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            e51 e51Var = this.c;
            if (e51Var.x0) {
                return;
            }
            e51Var.E0.setAllowNestedScroll(false);
            e51Var.x0 = true;
        }
    }
}
