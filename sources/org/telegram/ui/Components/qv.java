package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class qv extends v4.s {
    public final /* synthetic */ gy Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv(gy gyVar) {
        super(5);
        this.Q = gyVar;
    }

    @Override // v4.s, v4.b0, v4.n0
    public final int o0(int i7, v4.v0 v0Var, v4.a1 a1Var) {
        int o02 = super.o0(i7, v0Var, a1Var);
        gy gyVar = this.Q;
        if (o02 != 0 && gyVar.D0.getScrollState() == 1) {
            gyVar.X1 = false;
            gyVar.Z();
        }
        if (gyVar.T0 == null) {
            jg.e1 e1Var = new jg.e1(gyVar, gyVar.c1, gyVar.t1.a(), gyVar.t1.f(), 1);
            gyVar.T0 = e1Var;
            e1Var.a();
        }
        gyVar.T0.b();
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
