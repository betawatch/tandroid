package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public abstract class c41 extends b41 {
    public final int w;
    public final /* synthetic */ r41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c41(r41 r41Var, Context context, int i3, int i10, mg.f fVar) {
        super(context, i10, fVar, null);
        this.x = r41Var;
        this.w = i3;
    }

    @Override // org.telegram.ui.b41
    public final void b(d41 d41Var) {
        int i3;
        r41 r41Var = this.x;
        i3 = ((org.telegram.ui.ActionBar.d2) r41Var).classGuid;
        d41Var.a(this.w, i3, r41Var.a.stats_dc, new ah(2, r41Var, this.r));
    }

    @Override // org.telegram.ui.b41
    public final void c() {
        int i3;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        mg.g gVar = this.b;
        if (gVar.u0.H) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                d41 d41Var = this.r;
                d41Var.e = new ng.e(d41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            r41 r41Var = this.x;
            r41.c0(r41Var);
            String str = this.r.g + "_" + selectedDate;
            ng.b bVar = (ng.b) r41Var.V.f(str);
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
            q41 q41Var = new q41();
            r41Var.Z = q41Var;
            r41Var.T.getClass();
            q41Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            int i10 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new co0(this, str, q41Var, 10), null, null, 0, r41Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i3 = ((org.telegram.ui.ActionBar.d2) r41Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i3);
        }
    }

    @Override // org.telegram.ui.b41
    public final void f() {
        r41.c0(this.x);
    }
}
