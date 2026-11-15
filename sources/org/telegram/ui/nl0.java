package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final /* synthetic */ class nl0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ jm0 b;

    public /* synthetic */ nl0(jm0 jm0Var, int i7) {
        this.a = i7;
        this.b = jm0Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        jm0 jm0Var = this.b;
        jm0Var.c0 = I0;
        ul0 ul0Var = jm0Var.h.b;
        int i7 = I0.a;
        int paddingTop = ul0Var.getPaddingTop();
        i0.c cVar = jm0Var.c0;
        ul0Var.setPadding(i7, paddingTop, cVar.c, org.telegram.messenger.g0.L(72.0f) + cVar.d);
        ul0 ul0Var2 = jm0Var.n.b;
        int i10 = jm0Var.c0.a;
        int paddingTop2 = ul0Var2.getPaddingTop();
        i0.c cVar2 = jm0Var.c0;
        ul0Var2.setPadding(i10, paddingTop2, cVar2.c, org.telegram.messenger.g0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = jm0Var.Q;
        i0.c cVar3 = jm0Var.c0;
        frameLayout.setPadding(cVar3.a, 0, cVar3.c, cVar3.d);
        return r0.k1.b;
    }

    @Override // org.telegram.ui.ActionBar.q1
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
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
