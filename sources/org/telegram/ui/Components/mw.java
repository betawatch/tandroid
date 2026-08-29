package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class mw extends f2.w {
    public final /* synthetic */ fz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mw(fz fzVar) {
        super(5);
        this.Q = fzVar;
    }

    @Override // f2.w, f2.j0, f2.w0
    public final int o0(int i10, f2.d1 d1Var, f2.k1 k1Var) {
        int o02 = super.o0(i10, d1Var, k1Var);
        fz fzVar = this.Q;
        if (o02 != 0 && fzVar.z0.getScrollState() == 1) {
            fzVar.T1 = false;
            fzVar.a0();
        }
        if (fzVar.P0 == null) {
            vw vwVar = new vw(fzVar, fzVar.Y0, fzVar.p1.a(), fzVar.p1.f(), 0);
            fzVar.P0 = vwVar;
            vwVar.a();
        }
        fzVar.P0.b();
        return o02;
    }

    @Override // f2.j0, f2.w0
    public final void v0(RecyclerView recyclerView, f2.k1 k1Var, int i10) {
        try {
            uh.n nVar = new uh.n(recyclerView.getContext(), 2);
            nVar.a = i10;
            w0(nVar);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }
}
