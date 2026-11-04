package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class gl0 implements r0.m, org.telegram.ui.ActionBar.p1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ cm0 b;

    public /* synthetic */ gl0(cm0 cm0Var, int i3) {
        this.a = i3;
        this.b = cm0Var;
    }

    @Override // r0.m
    public r0.k1 R0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        cm0 cm0Var = this.b;
        cm0Var.c0 = I0;
        nl0 nl0Var = cm0Var.h.b;
        int i3 = I0.a;
        int paddingTop = nl0Var.getPaddingTop();
        i0.b bVar = cm0Var.c0;
        nl0Var.setPadding(i3, paddingTop, bVar.c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        nl0 nl0Var2 = cm0Var.n.b;
        int i10 = cm0Var.c0.a;
        int paddingTop2 = nl0Var2.getPaddingTop();
        i0.b bVar2 = cm0Var.c0;
        nl0Var2.setPadding(i10, paddingTop2, bVar2.c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = cm0Var.Q;
        i0.b bVar3 = cm0Var.c0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.p1
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
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
