package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-c4ea88e67dc56e5703ce3374834c68c9442b4bb60a0bad99fe22591c5d324222 */
/* loaded from: classes3.dex */
public abstract class f91 extends e91 {
    public final int v;
    public final /* synthetic */ u91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f91(u91 u91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.w = u91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.e91
    public final void b(g91 g91Var) {
        int i10;
        u91 u91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.o2) u91Var).classGuid;
        g91Var.a(this.v, i10, u91Var.a.stats_dc, new oh(2, u91Var, this.r));
    }

    @Override // org.telegram.ui.e91
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
                g91 g91Var = this.r;
                g91Var.e = new kg.e(g91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            u91 u91Var = this.w;
            u91.Z(u91Var);
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) u91Var.V.get(str);
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
            t91 t91Var = new t91();
            u91Var.Z = t91Var;
            u91Var.S.getClass();
            t91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new wr0(this, str, t91Var, 10), null, null, 0, u91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.o2) u91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.e91
    public final void f() {
        u91.Z(this.w);
    }
}
