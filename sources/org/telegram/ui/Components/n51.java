package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-54f46d3192cfcf06f3cb7093cda92e459a80ef6ed91a766593a44d0f1cb126c7 */
/* loaded from: classes3.dex */
public final class n51 implements kw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ o51 c;

    public n51(o51 o51Var) {
        this.c = o51Var;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void G(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            o51 o51Var = this.c;
            if (o51Var.x0) {
                return;
            }
            o51Var.E0.setAllowNestedScroll(false);
            o51Var.x0 = true;
        }
    }
}
