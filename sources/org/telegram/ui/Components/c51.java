package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class c51 implements zv0 {
    public int a;
    public boolean b;
    public final /* synthetic */ d51 c;

    public c51(d51 d51Var) {
        this.c = d51Var;
    }

    @Override // org.telegram.ui.Components.zv0
    public final void H(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            d51 d51Var = this.c;
            if (d51Var.x0) {
                return;
            }
            d51Var.E0.setAllowNestedScroll(false);
            d51Var.x0 = true;
        }
    }
}
