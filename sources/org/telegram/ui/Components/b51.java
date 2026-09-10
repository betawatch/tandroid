package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
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
