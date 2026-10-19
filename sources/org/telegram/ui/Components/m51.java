package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public final class m51 implements jw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ n51 c;

    public m51(n51 n51Var) {
        this.c = n51Var;
    }

    @Override // org.telegram.ui.Components.jw0
    public final void G(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            n51 n51Var = this.c;
            if (n51Var.x0) {
                return;
            }
            n51Var.E0.setAllowNestedScroll(false);
            n51Var.x0 = true;
        }
    }
}
