package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ww extends s4.s {
    public final /* synthetic */ nz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(nz nzVar) {
        super(5);
        this.Q = nzVar;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        nz nzVar = this.Q;
        if (o02 != 0 && nzVar.D0.getScrollState() == 1) {
            nzVar.X1 = false;
            nzVar.X();
        }
        if (nzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(nzVar, nzVar.c1, nzVar.t1.a(), nzVar.t1.f(), 1);
            nzVar.T0 = g1Var;
            g1Var.a();
        }
        nzVar.T0.b();
        return o02;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.a = i10;
            w0(oVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
