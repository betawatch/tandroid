package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class m51 implements kw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ n51 c;

    public m51(n51 n51Var) {
        this.c = n51Var;
    }

    @Override // org.telegram.ui.Components.kw0
    public final void F(int i10, boolean z10) {
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
