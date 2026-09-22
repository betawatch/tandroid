package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public abstract class ka1 extends ja1 {
    public final int v;
    public final /* synthetic */ za1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ka1(za1 za1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.w = za1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.ja1
    public final void b(la1 la1Var) {
        int i10;
        za1 za1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) za1Var).classGuid;
        la1Var.a(this.v, i10, za1Var.a.stats_dc, new org.telegram.ui.Components.s51(1, za1Var, this.r));
    }

    @Override // org.telegram.ui.ja1
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        ig.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                la1 la1Var = this.r;
                la1Var.e = new jg.e(la1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            za1 za1Var = this.w;
            za1.Z(za1Var);
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) za1Var.V.get(str);
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
            ya1 ya1Var = new ya1();
            za1Var.Z = ya1Var;
            za1Var.S.getClass();
            ya1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ns0(this, str, ya1Var, 10), null, null, 0, za1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) za1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.ja1
    public final void f() {
        za1.Z(this.w);
    }
}
