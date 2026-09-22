package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class e51 implements bw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ f51 c;

    public e51(f51 f51Var) {
        this.c = f51Var;
    }

    @Override // org.telegram.ui.Components.bw0
    public final void G(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            f51 f51Var = this.c;
            if (f51Var.x0) {
                return;
            }
            f51Var.E0.setAllowNestedScroll(false);
            f51Var.x0 = true;
        }
    }
}
