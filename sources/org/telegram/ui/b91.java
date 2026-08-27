package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public abstract class b91 extends a91 {
    public final int v;
    public final /* synthetic */ q91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b91(q91 q91Var, Context context, int i10, int i11, rf.f fVar) {
        super(context, i11, fVar, null);
        this.w = q91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.a91
    public final void b(c91 c91Var) {
        int i10;
        q91 q91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) q91Var).classGuid;
        c91Var.a(this.v, i10, q91Var.a.stats_dc, new org.telegram.ui.Components.x41(1, q91Var, this.r));
    }

    @Override // org.telegram.ui.a91
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        rf.g gVar = this.b;
        if (gVar.p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                c91 c91Var = this.r;
                c91Var.e = new sf.e(c91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            q91 q91Var = this.w;
            q91.Z(q91Var);
            String str = this.r.g + "_" + selectedDate;
            sf.b bVar = (sf.b) q91Var.R.get(str);
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
            p91 p91Var = new p91();
            q91Var.V = p91Var;
            q91Var.O.getClass();
            p91Var.a = RecyclerView.R(this);
            gVar.p0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new lr0(this, str, p91Var, 10), null, null, 0, q91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) q91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.a91
    public final void f() {
        q91.Z(this.w);
    }
}
