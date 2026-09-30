package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-518d3e50826c848a68038d28135b875c492a3e734bb6bb5b9a39b192f8b0e064 */
/* loaded from: classes3.dex */
public final class ww extends s4.s {
    public final /* synthetic */ mz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(mz mzVar) {
        super(5);
        this.Q = mzVar;
    }

    @Override // s4.s, s4.c0, s4.o0
    public final int o0(int i10, of.e eVar, s4.z0 z0Var) {
        int o02 = super.o0(i10, eVar, z0Var);
        mz mzVar = this.Q;
        if (o02 != 0 && mzVar.D0.getScrollState() == 1) {
            mzVar.X1 = false;
            mzVar.Y();
        }
        if (mzVar.T0 == null) {
            gg.g1 g1Var = new gg.g1(mzVar, mzVar.c1, mzVar.t1.a(), mzVar.t1.f(), 1);
            mzVar.T0 = g1Var;
            g1Var.a();
        }
        mzVar.T0.b();
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
