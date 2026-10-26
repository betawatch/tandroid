package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public abstract class h91 extends g91 {
    public final int v;
    public final /* synthetic */ w91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h91(w91 w91Var, Context context, int i10, int i11, kg.g gVar) {
        super(context, i11, gVar, null);
        this.w = w91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.g91
    public final void b(i91 i91Var) {
        int i10;
        w91 w91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.r2) w91Var).classGuid;
        i91Var.a(this.v, i10, w91Var.a.stats_dc, new qh(2, w91Var, this.r));
    }

    @Override // org.telegram.ui.g91
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        kg.h hVar = this.b;
        if (hVar.t0.G) {
            long selectedDate = hVar.getSelectedDate();
            if (this.s == 4) {
                i91 i91Var = this.r;
                i91Var.e = new lg.e(i91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            w91 w91Var = this.w;
            w91.Y(w91Var);
            String str = this.r.g + "_" + selectedDate;
            lg.b bVar = (lg.b) w91Var.U.get(str);
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
            v91 v91Var = new v91();
            w91Var.Y = v91Var;
            w91Var.S.getClass();
            v91Var.a = RecyclerView.R(this);
            hVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new as0(this, str, v91Var, 10), null, null, 0, w91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.r2) w91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.g91
    public final void f() {
        w91.Y(this.w);
    }
}
