package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-8dceb212ed2c2696933748198be2db68a1b0f76d4310ab1da4abb6983ea7d048 */
/* loaded from: classes3.dex */
public final class l51 implements iw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ m51 c;

    public l51(m51 m51Var) {
        this.c = m51Var;
    }

    @Override // org.telegram.ui.Components.iw0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            m51 m51Var = this.c;
            if (m51Var.x0) {
                return;
            }
            m51Var.E0.setAllowNestedScroll(false);
            m51Var.x0 = true;
        }
    }
}
