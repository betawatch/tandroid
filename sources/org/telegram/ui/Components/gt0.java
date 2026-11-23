package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class gt0 extends ft0 {
    public final /* synthetic */ ht0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gt0(ht0 ht0Var, Context context, int i7) {
        super(ht0Var.e, context, i7, false);
        this.H = ht0Var;
    }

    @Override // org.telegram.ui.Components.ft0, v4.i0
    public final void f() {
        super.f();
        ht0 ht0Var = this.H;
        it0 it0Var = ht0Var.e;
        int i7 = ht0Var.a;
        int[] iArr = it0.t2;
        ds0 g02 = it0Var.g0(i7);
        if (g02 != null && g02.n.getVisibility() == 0) {
            ht0Var.d.f();
        }
        if (g02 != null) {
            yq0 yq0Var = g02.w;
            fi.h6 h6Var = this.s;
            yq0Var.e(h6Var != null && (h6Var.k() || (it0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
