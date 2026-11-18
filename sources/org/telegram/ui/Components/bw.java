package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class bw extends v4.t {
    public final /* synthetic */ ry Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bw(ry ryVar) {
        super(5);
        this.Q = ryVar;
    }

    @Override // v4.t, v4.c0, v4.p0
    public final int o0(int i7, v4.x0 x0Var, v4.c1 c1Var) {
        int o02 = super.o0(i7, x0Var, c1Var);
        ry ryVar = this.Q;
        if (o02 != 0 && ryVar.E0.getScrollState() == 1) {
            ryVar.Y1 = false;
            ryVar.Z();
        }
        if (ryVar.U0 == null) {
            jg.d1 d1Var = new jg.d1(ryVar, ryVar.d1, ryVar.u1.a(), ryVar.u1.f(), 1);
            ryVar.U0 = d1Var;
            d1Var.a();
        }
        ryVar.U0.b();
        return o02;
    }

    @Override // v4.c0, v4.p0
    public final void v0(RecyclerView recyclerView, v4.c1 c1Var, int i7) {
        try {
            pi.l lVar = new pi.l(recyclerView.getContext(), 2);
            lVar.a = i7;
            w0(lVar);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }
}
