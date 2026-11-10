package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public abstract class o41 extends n41 {
    public final int w;
    public final /* synthetic */ e51 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o41(e51 e51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.x = e51Var;
        this.w = i7;
    }

    @Override // org.telegram.ui.n41
    public final void b(q41 q41Var) {
        int i7;
        e51 e51Var = this.x;
        i7 = ((org.telegram.ui.ActionBar.f2) e51Var).classGuid;
        q41Var.a(this.w, i7, e51Var.a.stats_dc, new gh(2, e51Var, this.r));
    }

    @Override // org.telegram.ui.n41
    public final void c() {
        int i7;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                q41 q41Var = this.r;
                q41Var.e = new mg.e(q41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            e51 e51Var = this.x;
            e51.c0(e51Var);
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) e51Var.U.f(str);
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
            d51 d51Var = new d51();
            e51Var.Y = d51Var;
            e51Var.S.getClass();
            d51Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i10 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new oo0(this, str, d51Var, 10), null, null, 0, e51Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i7 = ((org.telegram.ui.ActionBar.f2) e51Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i7);
        }
    }

    @Override // org.telegram.ui.n41
    public final void f() {
        e51.c0(this.x);
    }
}
