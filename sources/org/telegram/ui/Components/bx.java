package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.messenger.FileLog;

/* compiled from: r8-map-id-5c4d11c5a4a3c3963e49de090c9ebed761f6fe8b7d1fb1bb05822f03003d35b5 */
/* loaded from: classes3.dex */
public final class bx extends s4.s {
    public final /* synthetic */ tz Q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bx(tz tzVar) {
        super(5);
        this.Q = tzVar;
    }

    @Override // s4.s, s4.b0, s4.n0
    public final int o0(int i10, qf.e eVar, s4.y0 y0Var) {
        int o02 = super.o0(i10, eVar, y0Var);
        tz tzVar = this.Q;
        if (o02 != 0 && tzVar.D0.getScrollState() == 1) {
            tzVar.X1 = false;
            tzVar.Y();
        }
        if (tzVar.T0 == null) {
            hg.f1 f1Var = new hg.f1(tzVar, tzVar.c1, tzVar.t1.a(), tzVar.t1.f(), 1);
            tzVar.T0 = f1Var;
            f1Var.a();
        }
        tzVar.T0.b();
        return o02;
    }

    @Override // s4.b0, s4.n0
    public final void v0(RecyclerView recyclerView, s4.y0 y0Var, int i10) {
        try {
            li.n nVar = new li.n(recyclerView.getContext(), 2);
            nVar.a = i10;
            w0(nVar);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
