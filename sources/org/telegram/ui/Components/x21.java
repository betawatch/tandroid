package org.telegram.ui.Components;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class x21 implements pt0 {
    public int a;
    public boolean b;
    public final /* synthetic */ y21 c;

    public x21(y21 y21Var) {
        this.c = y21Var;
    }

    @Override // org.telegram.ui.Components.pt0
    public final void K(int i3, boolean z10) {
        if (this.a == i3 && this.b == z10) {
            return;
        }
        this.a = i3;
        this.b = z10;
        if (i3 > org.telegram.messenger.g0.L(20.0f)) {
            y21 y21Var = this.c;
            if (y21Var.h0) {
                return;
            }
            y21Var.o0.r0 = false;
            y21Var.h0 = true;
        }
    }
}
