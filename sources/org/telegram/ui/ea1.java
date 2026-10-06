package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public abstract class ea1 extends da1 {
    public final int v;
    public final /* synthetic */ ta1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ea1(ta1 ta1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.w = ta1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.da1
    public final void b(fa1 fa1Var) {
        int i10;
        ta1 ta1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) ta1Var).classGuid;
        fa1Var.a(this.v, i10, ta1Var.a.stats_dc, new org.telegram.ui.Components.s61(1, ta1Var, this.r));
    }

    @Override // org.telegram.ui.da1
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
                fa1 fa1Var = this.r;
                fa1Var.e = new jg.e(fa1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            ta1 ta1Var = this.w;
            ta1.W(ta1Var);
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) ta1Var.U.get(str);
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
            sa1 sa1Var = new sa1();
            ta1Var.Y = sa1Var;
            ta1Var.S.getClass();
            sa1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new is0(this, str, sa1Var, 10), null, null, 0, ta1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) ta1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.da1
    public final void f() {
        ta1.W(this.w);
    }
}
