package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class n41 implements ov0 {
    public int a;
    public boolean b;
    public final /* synthetic */ o41 c;

    public n41(o41 o41Var) {
        this.c = o41Var;
    }

    @Override // org.telegram.ui.Components.ov0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            o41 o41Var = this.c;
            if (o41Var.x0) {
                return;
            }
            o41Var.E0.setAllowNestedScroll(false);
            o41Var.x0 = true;
        }
    }
}
