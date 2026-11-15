package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-ca0014cba5a37e4c611014264e76a6d5467852d34299934bcc713efe0d9e05bc */
/* loaded from: classes3.dex */
public abstract class k41 extends j41 {
    public final int w;
    public final /* synthetic */ z41 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k41(z41 z41Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.x = z41Var;
        this.w = i7;
    }

    @Override // org.telegram.ui.j41
    public final void b(l41 l41Var) {
        int i7;
        z41 z41Var = this.x;
        i7 = ((org.telegram.ui.ActionBar.e2) z41Var).classGuid;
        l41Var.a(this.w, i7, z41Var.a.stats_dc, new eh(2, z41Var, this.r));
    }

    @Override // org.telegram.ui.j41
    public final void c() {
        int i7;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.u0.H) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                l41 l41Var = this.r;
                l41Var.e = new mg.e(l41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            z41 z41Var = this.x;
            z41.c0(z41Var);
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) z41Var.V.f(str);
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
            y41 y41Var = new y41();
            z41Var.Z = y41Var;
            z41Var.T.getClass();
            y41Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            int i10 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new jo0(this, str, y41Var, 10), null, null, 0, z41Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i7 = ((org.telegram.ui.ActionBar.e2) z41Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i7);
        }
    }

    @Override // org.telegram.ui.j41
    public final void f() {
        z41.c0(this.x);
    }
}
