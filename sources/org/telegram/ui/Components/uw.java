package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class uw extends s4.s {
    public final /* synthetic */ kz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uw(kz kzVar) {
        super(5);
        this.Q = kzVar;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        kz kzVar = this.Q;
        if (o02 != 0 && kzVar.D0.getScrollState() == 1) {
            kzVar.X1 = false;
            kzVar.Y();
        }
        if (kzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(kzVar, kzVar.c1, kzVar.t1.a(), kzVar.t1.f(), 1);
            kzVar.T0 = g1Var;
            g1Var.a();
        }
        kzVar.T0.b();
        return o02;
    }

    @Override // s4.c0, s4.o0
    public final void v0(RecyclerView recyclerView, s4.z0 z0Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
