package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public abstract class ca1 extends ba1 {
    public final int v;
    public final /* synthetic */ ra1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ca1(ra1 ra1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.w = ra1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.ba1
    public final void b(da1 da1Var) {
        int i10;
        ra1 ra1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) ra1Var).classGuid;
        da1Var.a(this.v, i10, ra1Var.a.stats_dc, new org.telegram.ui.Components.r51(1, ra1Var, this.r));
    }

    @Override // org.telegram.ui.ba1
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
                da1 da1Var = this.r;
                da1Var.e = new jg.e(da1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            ra1 ra1Var = this.w;
            ra1.Z(ra1Var);
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) ra1Var.V.get(str);
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
            qa1 qa1Var = new qa1();
            ra1Var.Z = qa1Var;
            ra1Var.S.getClass();
            qa1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new gs0(this, str, qa1Var, 10), null, null, 0, ra1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) ra1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.ba1
    public final void f() {
        ra1.Z(this.w);
    }
}
