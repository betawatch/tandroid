package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public abstract class da1 extends ca1 {
    public final int v;
    public final /* synthetic */ sa1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public da1(sa1 sa1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.w = sa1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.ca1
    public final void b(ea1 ea1Var) {
        int i10;
        sa1 sa1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.m2) sa1Var).classGuid;
        ea1Var.a(this.v, i10, sa1Var.a.stats_dc, new org.telegram.ui.Components.f61(1, sa1Var, this.r));
    }

    @Override // org.telegram.ui.ca1
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
                ea1 ea1Var = this.r;
                ea1Var.e = new jg.e(ea1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            sa1 sa1Var = this.w;
            sa1.Z(sa1Var);
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) sa1Var.V.get(str);
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
            ra1 ra1Var = new ra1();
            sa1Var.Z = ra1Var;
            sa1Var.S.getClass();
            ra1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new fs0(this, str, ra1Var, 10), null, null, 0, sa1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.m2) sa1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.ca1
    public final void f() {
        sa1.Z(this.w);
    }
}
