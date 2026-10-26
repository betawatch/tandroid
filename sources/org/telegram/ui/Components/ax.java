package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class ax extends s4.t {
    public final /* synthetic */ sz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ax(sz szVar) {
        super(5);
        this.Q = szVar;
    }

    @Override // s4.t, s4.c0, s4.p0
    public final int o0(int i10, rf.e eVar, s4.b1 b1Var) {
        int o02 = super.o0(i10, eVar, b1Var);
        sz szVar = this.Q;
        if (o02 != 0 && szVar.D0.getScrollState() == 1) {
            szVar.X1 = false;
            szVar.Y();
        }
        if (szVar.T0 == null) {
            ig.f1 f1Var = new ig.f1(szVar, szVar.c1, szVar.t1.a(), szVar.t1.f(), 1);
            szVar.T0 = f1Var;
            f1Var.a();
        }
        szVar.T0.b();
        return o02;
    }

    @Override // s4.c0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.b1 b1Var, int i10) {
        try {
            mi.n nVar = new mi.n(recyclerView.getContext(), 2);
            nVar.a = i10;
            w0(nVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
