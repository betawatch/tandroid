package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public abstract class f61 extends e61 {
    public final int w;
    public final /* synthetic */ u61 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f61(u61 u61Var, Context context, int i10, int i11, bg.h hVar) {
        super(context, i11, hVar, null);
        this.x = u61Var;
        this.w = i10;
    }

    @Override // org.telegram.ui.e61
    public final void b(g61 g61Var) {
        int i10;
        u61 u61Var = this.x;
        i10 = ((org.telegram.ui.ActionBar.k2) u61Var).classGuid;
        g61Var.a(this.w, i10, u61Var.a.stats_dc, new uh(2, u61Var, this.r));
    }

    @Override // org.telegram.ui.e61
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        bg.i iVar = this.b;
        if (iVar.t0.G) {
            long selectedDate = iVar.getSelectedDate();
            if (this.s == 4) {
                g61 g61Var = this.r;
                g61Var.e = new cg.e(g61Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            u61 u61Var = this.x;
            u61.b0(u61Var);
            String str = this.r.g + "_" + selectedDate;
            cg.b bVar = (cg.b) u61Var.U.f(str);
            if (bVar != null) {
                this.r.e = bVar;
                g(false);
                return;
            }
            TL_stats.TL_loadAsyncGraph tL_loadAsyncGraph = new TL_stats.TL_loadAsyncGraph();
            tL_loadAsyncGraph.token = this.r.g;
            if (selectedDate != 0) {
                tL_loadAsyncGraph.x = selectedDate;
                tL_loadAsyncGraph.flags |= 1;
            }
            t61 t61Var = new t61();
            u61Var.Y = t61Var;
            u61Var.S.getClass();
            t61Var.a = RecyclerView.R(this);
            iVar.t0.d(true, false);
            int i11 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new vp0(this, str, t61Var, 10), null, null, 0, u61Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.k2) u61Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.e61
    public final void f() {
        u61.b0(this.x);
    }
}
