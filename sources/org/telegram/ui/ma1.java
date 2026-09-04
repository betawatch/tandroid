package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-1d37b327b7539539df9db5f3096c2b1fda35266a40e118b6745b92f988bd863c */
/* loaded from: classes3.dex */
public abstract class ma1 extends la1 {
    public final int v;
    public final /* synthetic */ bb1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ma1(bb1 bb1Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.w = bb1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.la1
    public final void b(na1 na1Var) {
        int i10;
        bb1 bb1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
        na1Var.a(this.v, i10, bb1Var.a.stats_dc, new org.telegram.ui.Components.r51(1, bb1Var, this.r));
    }

    @Override // org.telegram.ui.la1
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                na1 na1Var = this.r;
                na1Var.e = new kg.e(na1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            bb1 bb1Var = this.w;
            bb1.Z(bb1Var);
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) bb1Var.V.get(str);
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
            ab1 ab1Var = new ab1();
            bb1Var.Z = ab1Var;
            bb1Var.S.getClass();
            ab1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ms0(this, str, ab1Var, 10), null, null, 0, bb1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) bb1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.la1
    public final void f() {
        bb1.Z(this.w);
    }
}
