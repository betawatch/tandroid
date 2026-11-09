package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ nl0(jm0 jm0Var, int i7) {
        this.a = i7;
        this.b = jm0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        jm0 jm0Var = this.b;
        jm0Var.b0 = I0;
        ul0 ul0Var = jm0Var.h.b;
        int i7 = I0.a;
        int paddingTop = ul0Var.getPaddingTop();
        i0.b bVar = jm0Var.b0;
        ul0Var.setPadding(i7, paddingTop, bVar.c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        ul0 ul0Var2 = jm0Var.n.b;
        int i10 = jm0Var.b0.a;
        int paddingTop2 = ul0Var2.getPaddingTop();
        i0.b bVar2 = jm0Var.b0;
        ul0Var2.setPadding(i10, paddingTop2, bVar2.c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = jm0Var.P;
        i0.b bVar3 = jm0Var.b0;
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
