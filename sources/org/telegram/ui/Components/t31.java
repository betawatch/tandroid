package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class t31 implements yu0 {
    public int a;
    public boolean b;
    public final /* synthetic */ u31 c;

    public t31(u31 u31Var) {
        this.c = u31Var;
    }

    @Override // org.telegram.ui.Components.yu0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            u31 u31Var = this.c;
            if (u31Var.t0) {
                return;
            }
            u31Var.A0.setAllowNestedScroll(false);
            u31Var.t0 = true;
        }
    }
}
