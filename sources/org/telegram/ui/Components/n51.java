package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class n51 implements lw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ o51 c;

    public n51(o51 o51Var) {
        this.c = o51Var;
    }

    @Override // org.telegram.ui.Components.lw0
    public final void F(int i10, boolean z10) {
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
