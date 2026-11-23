package org.telegram.ui;

import android.view.View;
import android.widget.FrameLayout;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final /* synthetic */ class pl0 implements r0.m, org.telegram.ui.ActionBar.q1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ lm0 b;

    public /* synthetic */ pl0(lm0 lm0Var, int i7) {
        this.a = i7;
        this.b = lm0Var;
    }

    @Override // r0.m
    public r0.l1 P0(View view, r0.l1 l1Var) {
        i0.b I0 = org.telegram.messenger.g0.I0(l1Var, false);
        lm0 lm0Var = this.b;
        lm0Var.c0 = I0;
        wl0 wl0Var = lm0Var.h.b;
        int i7 = I0.a;
        int paddingTop = wl0Var.getPaddingTop();
        i0.b bVar = lm0Var.c0;
        wl0Var.setPadding(i7, paddingTop, bVar.c, org.telegram.messenger.g0.L(72.0f) + bVar.d);
        wl0 wl0Var2 = lm0Var.n.b;
        int i10 = lm0Var.c0.a;
        int paddingTop2 = wl0Var2.getPaddingTop();
        i0.b bVar2 = lm0Var.c0;
        wl0Var2.setPadding(i10, paddingTop2, bVar2.c, org.telegram.messenger.g0.L(72.0f) + bVar2.d);
        FrameLayout frameLayout = lm0Var.Q;
        i0.b bVar3 = lm0Var.c0;
        frameLayout.setPadding(bVar3.a, 0, bVar3.c, bVar3.d);
        return r0.l1.b;
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
