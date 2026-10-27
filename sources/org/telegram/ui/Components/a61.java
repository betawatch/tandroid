package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public final class a61 implements vw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ b61 c;

    public a61(b61 b61Var) {
        this.c = b61Var;
    }

    @Override // org.telegram.ui.Components.vw0
    public final void I(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            b61 b61Var = this.c;
            if (b61Var.m0) {
                return;
            }
            b61Var.t0.setAllowNestedScroll(false);
            b61Var.m0 = true;
        }
    }
}
