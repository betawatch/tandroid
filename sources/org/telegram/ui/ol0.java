package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ol0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ km0 b;

    public /* synthetic */ ol0(km0 km0Var, int i7) {
        this.a = i7;
        this.b = km0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        km0 km0Var = this.b;
        km0Var.b0 = I0;
        vl0 vl0Var = km0Var.h.b;
        int i7 = I0.a;
        int paddingTop = vl0Var.getPaddingTop();
        i0.b bVar = km0Var.b0;
        vl0Var.setPadding(i7, paddingTop, bVar.c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        vl0 vl0Var2 = km0Var.n.b;
        int i10 = km0Var.b0.a;
        int paddingTop2 = vl0Var2.getPaddingTop();
        i0.b bVar2 = km0Var.b0;
        vl0Var2.setPadding(i10, paddingTop2, bVar2.c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = km0Var.P;
        i0.b bVar3 = km0Var.b0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.r1
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.D0();
                break;
        }
    }
}
