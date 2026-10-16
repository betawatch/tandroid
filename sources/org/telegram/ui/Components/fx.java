package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class fx extends s4.s {
    public final /* synthetic */ wz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fx(wz wzVar) {
        super(5);
        this.Q = wzVar;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int o02 = super.o0(i10, eVar, y0Var);
        wz wzVar = this.Q;
        if (o02 != 0 && wzVar.D0.getScrollState() == 1) {
            wzVar.X1 = false;
            wzVar.Y();
        }
        if (wzVar.T0 == null) {
            hg.f1 f1Var = new hg.f1(wzVar, wzVar.c1, wzVar.t1.a(), wzVar.t1.f(), 1);
            wzVar.T0 = f1Var;
            f1Var.a();
        }
        wzVar.T0.b();
        return o02;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            ki.o oVar = new ki.o(recyclerView.getContext(), 2);
            oVar.a = i10;
            w0(oVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
