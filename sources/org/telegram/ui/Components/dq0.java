package org.telegram.ui.Components;

import android.content.Context;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class dq0 extends ft0 {
    public final /* synthetic */ it0 H;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq0(it0 it0Var, Context context) {
        super(it0Var, context, 0, true);
        this.H = it0Var;
    }

    @Override // org.telegram.ui.Components.ft0, v4.i0
    public final void f() {
        super.f();
        it0 it0Var = this.H;
        ds0 g02 = it0Var.g0(9);
        if (g02 != null && g02.n.getVisibility() == 0) {
            it0Var.i0.f();
        }
        if (g02 != null) {
            yq0 yq0Var = g02.w;
            fi.h6 h6Var = this.s;
            yq0Var.e(h6Var != null && (h6Var.k() || (it0Var.t0() && this.s.g() > 0)), true);
        }
    }
}
