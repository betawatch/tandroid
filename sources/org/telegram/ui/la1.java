package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public abstract class la1 extends ka1 {
    public final int v;
    public final /* synthetic */ ab1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public la1(ab1 ab1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.w = ab1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.ka1
    public final void b(ma1 ma1Var) {
        int i10;
        ab1 ab1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.o2) ab1Var).classGuid;
        ma1Var.a(this.v, i10, ab1Var.a.stats_dc, new org.telegram.ui.Components.t51(1, ab1Var, this.r));
    }

    @Override // org.telegram.ui.ka1
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
                ma1 ma1Var = this.r;
                ma1Var.e = new jg.e(ma1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            ab1 ab1Var = this.w;
            ab1.Z(ab1Var);
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) ab1Var.V.get(str);
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
            za1 za1Var = new za1();
            ab1Var.Z = za1Var;
            ab1Var.S.getClass();
            za1Var.a = RecyclerView.S(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ps0(this, str, za1Var, 10), null, null, 0, ab1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.o2) ab1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.ka1
    public final void f() {
        ab1.Z(this.w);
    }
}
