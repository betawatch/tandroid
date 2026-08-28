package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public abstract class d91 extends c91 {
    public final int v;
    public final /* synthetic */ s91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d91(s91 s91Var, Context context, int i9, int i10, qf.f fVar) {
        super(context, i10, fVar, null);
        this.w = s91Var;
        this.v = i9;
    }

    @Override // org.telegram.ui.c91
    public final void b(e91 e91Var) {
        int i9;
        s91 s91Var = this.w;
        i9 = ((org.telegram.ui.ActionBar.o2) s91Var).classGuid;
        e91Var.a(this.v, i9, s91Var.a.stats_dc, new org.telegram.ui.Components.v41(1, s91Var, this.r));
    }

    @Override // org.telegram.ui.c91
    public final void c() {
        int i9;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        qf.g gVar = this.b;
        if (gVar.p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                e91 e91Var = this.r;
                e91Var.e = new rf.e(e91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            s91 s91Var = this.w;
            s91.Y(s91Var);
            String str = this.r.g + "_" + selectedDate;
            rf.b bVar = (rf.b) s91Var.R.get(str);
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
            r91 r91Var = new r91();
            s91Var.V = r91Var;
            s91Var.O.getClass();
            r91Var.a = RecyclerView.R(this);
            gVar.p0.d(true, false);
            int i10 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new kr0(this, str, r91Var, 10), null, null, 0, s91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i9 = ((org.telegram.ui.ActionBar.o2) s91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i9);
        }
    }

    @Override // org.telegram.ui.c91
    public final void f() {
        s91.Y(this.w);
    }
}
