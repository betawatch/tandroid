package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-369b18558ee44d7c02da03749698f243834c4dc18c963f2fca12b131da0d4d06 */
/* loaded from: classes3.dex */
public abstract class j91 extends i91 {
    public final int v;
    public final /* synthetic */ y91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j91(y91 y91Var, Context context, int i10, int i11, kg.g gVar) {
        super(context, i11, gVar, null);
        this.w = y91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.i91
    public final void b(k91 k91Var) {
        int i10;
        y91 y91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.r2) y91Var).classGuid;
        k91Var.a(this.v, i10, y91Var.a.stats_dc, new rh(2, y91Var, this.r));
    }

    @Override // org.telegram.ui.i91
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
                k91 k91Var = this.r;
                k91Var.e = new lg.e(k91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            y91 y91Var = this.w;
            y91.Y(y91Var);
            String str = this.r.g + "_" + selectedDate;
            lg.b bVar = (lg.b) y91Var.U.get(str);
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
            x91 x91Var = new x91();
            y91Var.Y = x91Var;
            y91Var.S.getClass();
            x91Var.a = RecyclerView.R(this);
            hVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new cs0(this, str, x91Var, 10), null, null, 0, y91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.r2) y91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.i91
    public final void f() {
        y91.Y(this.w);
    }
}
