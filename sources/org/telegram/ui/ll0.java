package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final /* synthetic */ class ll0 implements r0.m, org.telegram.ui.ActionBar.r1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ hm0 b;

    public /* synthetic */ ll0(hm0 hm0Var, int i7) {
        this.a = i7;
        this.b = hm0Var;
    }

    @Override // r0.m
    public r0.k1 S0(View view, r0.k1 k1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(k1Var, false);
        hm0 hm0Var = this.b;
        hm0Var.b0 = I0;
        sl0 sl0Var = hm0Var.h.b;
        int i7 = I0.a;
        int paddingTop = sl0Var.getPaddingTop();
        i0.b bVar = hm0Var.b0;
        sl0Var.setPadding(i7, paddingTop, bVar.c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        sl0 sl0Var2 = hm0Var.n.b;
        int i10 = hm0Var.b0.a;
        int paddingTop2 = sl0Var2.getPaddingTop();
        i0.b bVar2 = hm0Var.b0;
        sl0Var2.setPadding(i10, paddingTop2, bVar2.c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = hm0Var.P;
        i0.b bVar3 = hm0Var.b0;
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
