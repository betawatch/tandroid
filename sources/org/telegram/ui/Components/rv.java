package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public final class rv extends v4.s {
    public final /* synthetic */ hy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv(hy hyVar) {
        super(5);
        this.Q = hyVar;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int o02 = super.o0(i7, v0Var, a1Var);
        hy hyVar = this.Q;
        if (o02 != 0 && hyVar.D0.getScrollState() == 1) {
            hyVar.X1 = false;
            hyVar.Z();
        }
        if (hyVar.T0 == null) {
            jg.e1 e1Var = new jg.e1(hyVar, hyVar.c1, hyVar.t1.a(), hyVar.t1.f(), 1);
            hyVar.T0 = e1Var;
            e1Var.a();
        }
        hyVar.T0.b();
        return o02;
    }

    @Override // v4.b0, v4.n0
    public final void v0(RecyclerView recyclerView, v4.a1 a1Var, int i7) {
        try {
            mi.m mVar = new mi.m(recyclerView.getContext(), 2);
            mVar.a = i7;
            w0(mVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
