package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class jx extends s4.s {
    public final /* synthetic */ a00 Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jx(a00 a00Var) {
        super(5);
        this.Q = a00Var;
    }

    @Override // s4.s, s4.d0, s4.p0
    public final int o0(int i10, pf.e eVar, s4.a1 a1Var) {
        int o02 = super.o0(i10, eVar, a1Var);
        a00 a00Var = this.Q;
        if (o02 != 0 && a00Var.D0.getScrollState() == 1) {
            a00Var.X1 = false;
            a00Var.Y();
        }
        if (a00Var.T0 == null) {
            gg.f1 f1Var = new gg.f1(a00Var, a00Var.c1, a00Var.t1.a(), a00Var.t1.f(), 1);
            a00Var.T0 = f1Var;
            f1Var.a();
        }
        a00Var.T0.b();
        return o02;
    }

    @Override // s4.d0, s4.p0
    public final void v0(RecyclerView recyclerView, s4.a1 a1Var, int i10) {
        try {
            ji.o oVar = new ji.o(recyclerView.getContext(), 2);
            oVar.a = i10;
            w0(oVar);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }
}
