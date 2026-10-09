package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class v51 implements rw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ w51 c;

    public v51(w51 w51Var) {
        this.c = w51Var;
    }

    @Override // org.telegram.ui.Components.rw0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            w51 w51Var = this.c;
            if (w51Var.x0) {
                return;
            }
            w51Var.E0.setAllowNestedScroll(false);
            w51Var.x0 = true;
        }
    }
}
