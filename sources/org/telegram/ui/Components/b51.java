package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class b51 implements zv0 {
    public int a;
    public boolean b;
    public final /* synthetic */ c51 c;

    public b51(c51 c51Var) {
        this.c = c51Var;
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            c51 c51Var = this.c;
            if (c51Var.x0) {
                return;
            }
            c51Var.E0.setAllowNestedScroll(false);
            c51Var.x0 = true;
        }
    }
}
