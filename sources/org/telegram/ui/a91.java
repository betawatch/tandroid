package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-425f9d3693dca7cdb7b1343a62ca29dd4bfbf482fa37d742abbdfab31448a8bd */
/* loaded from: classes3.dex */
public abstract class a91 extends z81 {
    public final int v;
    public final /* synthetic */ p91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a91(p91 p91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.w = p91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.z81
    public final void b(b91 b91Var) {
        int i10;
        p91 p91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) p91Var).classGuid;
        b91Var.a(this.v, i10, p91Var.a.stats_dc, new oh(2, p91Var, this.r));
    }

    @Override // org.telegram.ui.z81
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
                b91 b91Var = this.r;
                b91Var.e = new kg.e(b91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            p91 p91Var = this.w;
            p91.Z(p91Var);
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) p91Var.V.get(str);
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
            o91 o91Var = new o91();
            p91Var.Z = o91Var;
            p91Var.S.getClass();
            o91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new tr0(this, str, o91Var, 10), null, null, 0, p91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) p91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.z81
    public final void f() {
        p91.Z(this.w);
    }
}
