package org.telegram.ui.Components;

import org.telegram.messenger.AndroidUtilities;

/* compiled from: r8-map-id-6bb23a39fe2d1bb2dc6cc69f606436ba751c240cf93e0ff97ff041cb9f09a305 */
/* loaded from: classes3.dex */
public final class s51 implements nw0 {
    public int a;
    public boolean b;
    public final /* synthetic */ t51 c;

    public s51(t51 t51Var) {
        this.c = t51Var;
    }

    @Override // org.telegram.ui.Components.nw0
    public final void G(int i10, boolean z10) {
        if (this.a == i10 && this.b == z10) {
            return;
        }
        this.a = i10;
        this.b = z10;
        if (i10 > AndroidUtilities.dp(20.0f)) {
            t51 t51Var = this.c;
            if (t51Var.x0) {
                return;
            }
            t51Var.E0.setAllowNestedScroll(false);
            t51Var.x0 = true;
        }
    }
}
