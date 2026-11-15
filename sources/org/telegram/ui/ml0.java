package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public final /* synthetic */ class ml0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ im0 b;

    public /* synthetic */ ml0(im0 im0Var, int i7) {
        this.a = i7;
        this.b = im0Var;
    }

    @Override // r0.m
    public r0.k1 M0(View view, r0.k1 k1Var) {
        i0.c I0 = org.telegram.messenger.g0.I0(k1Var, false);
        im0 im0Var = this.b;
        im0Var.c0 = I0;
        tl0 tl0Var = im0Var.h.b;
        int i7 = I0.a;
        int paddingTop = tl0Var.getPaddingTop();
        i0.c cVar = im0Var.c0;
        tl0Var.setPadding(i7, paddingTop, cVar.c, org.telegram.messenger.g0.L(72.0f) + cVar.d);
        tl0 tl0Var2 = im0Var.n.b;
        int i10 = im0Var.c0.a;
        int paddingTop2 = tl0Var2.getPaddingTop();
        i0.c cVar2 = im0Var.c0;
        tl0Var2.setPadding(i10, paddingTop2, cVar2.c, org.telegram.messenger.g0.L(72.0f) + cVar2.d);
        FrameLayout frameLayout = im0Var.Q;
        i0.c cVar3 = im0Var.c0;
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
