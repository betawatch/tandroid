package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class cw extends s4.r {
    public final /* synthetic */ vy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cw(vy vyVar) {
        super(5);
        this.Q = vyVar;
    }

    @Override // s4.r, s4.a0, s4.n0
    public final int o0(int i10, hf.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        vy vyVar = this.Q;
        if (o02 != 0 && vyVar.D0.getScrollState() == 1) {
            vyVar.X1 = false;
            vyVar.Z();
        }
        if (vyVar.T0 == null) {
            mw mwVar = new mw(vyVar, vyVar.c1, vyVar.t1.a(), vyVar.t1.f(), 0);
            vyVar.T0 = mwVar;
            mwVar.a();
        }
        vyVar.T0.b();
        return o02;
    }

    @Override // s4.a0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ci.p pVar = new ci.p(recyclerView.getContext(), 2);
            pVar.a = i10;
            w0(pVar);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }
}
