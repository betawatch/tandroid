package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public abstract class n41 extends m41 {
    public final int w;
    public final /* synthetic */ d51 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(d51 d51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.x = d51Var;
        this.w = i7;
    }

    @Override // org.telegram.ui.m41
    public final void b(p41 p41Var) {
        int i7;
        d51 d51Var = this.x;
        i7 = ((org.telegram.ui.ActionBar.f2) d51Var).classGuid;
        p41Var.a(this.w, i7, d51Var.a.stats_dc, new gh(2, d51Var, this.r));
    }

    @Override // org.telegram.ui.m41
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
                p41 p41Var = this.r;
                p41Var.e = new mg.e(p41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            d51 d51Var = this.x;
            d51.c0(d51Var);
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) d51Var.U.f(str);
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
            c51 c51Var = new c51();
            d51Var.Y = c51Var;
            d51Var.S.getClass();
            c51Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i10 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new no0(this, str, c51Var, 10), null, null, 0, d51Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i7 = ((org.telegram.ui.ActionBar.f2) d51Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i7);
        }
    }

    @Override // org.telegram.ui.m41
    public final void f() {
        d51.c0(this.x);
    }
}
