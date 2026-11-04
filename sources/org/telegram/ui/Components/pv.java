package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class pv extends u4.s {
    public final /* synthetic */ ey Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pv(ey eyVar) {
        super(5);
        this.Q = eyVar;
    }

    @Override // u4.s, u4.b0, u4.o0
    public final int o0(int i3, tf.e eVar, u4.a1 a1Var) {
        int o02 = super.o0(i3, eVar, a1Var);
        ey eyVar = this.Q;
        if (o02 != 0 && eyVar.E0.getScrollState() == 1) {
            eyVar.Y1 = false;
            eyVar.Z();
        }
        if (eyVar.U0 == null) {
            kg.a1 a1Var2 = new kg.a1(eyVar, eyVar.d1, eyVar.u1.a(), eyVar.u1.f(), 1);
            eyVar.U0 = a1Var2;
            a1Var2.a();
        }
        eyVar.U0.b();
        return o02;
    }

    @Override // u4.b0, u4.o0
    public final void v0(RecyclerView recyclerView, u4.a1 a1Var, int i3) {
        try {
            ni.m mVar = new ni.m(recyclerView.getContext(), 2);
            mVar.a = i3;
            w0(mVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
