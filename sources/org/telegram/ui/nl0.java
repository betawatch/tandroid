package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ nl0(jm0 jm0Var, int i7) {
        this.a = i7;
        this.b = jm0Var;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.a) {
            case 1:
                this.b.finishFragment();
                break;
            default:
                this.b.D0();
                break;
        }
    }

    @Override // r0.m
    public r0.l1 l1(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        jm0 jm0Var = this.b;
        jm0Var.c0 = I0;
        ul0 ul0Var = jm0Var.h.b;
        int i7 = I0.a;
        int paddingTop = ul0Var.getPaddingTop();
        i0.b bVar = jm0Var.c0;
        ul0Var.setPadding(i7, paddingTop, bVar.c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        ul0 ul0Var2 = jm0Var.n.b;
        int i10 = jm0Var.c0.a;
        int paddingTop2 = ul0Var2.getPaddingTop();
        i0.b bVar2 = jm0Var.c0;
        ul0Var2.setPadding(i10, paddingTop2, bVar2.c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = jm0Var.Q;
        i0.b bVar3 = jm0Var.c0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
    }
}
