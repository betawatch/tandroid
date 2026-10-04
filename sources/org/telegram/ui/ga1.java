package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public abstract class ga1 extends fa1 {
    public final int v;
    public final /* synthetic */ va1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ga1(va1 va1Var, Context context, int i10, int i11, ig.f fVar) {
        super(context, i11, fVar, null);
        this.w = va1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.fa1
    public final void b(ha1 ha1Var) {
        int i10;
        va1 va1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) va1Var).classGuid;
        ha1Var.a(this.v, i10, va1Var.a.stats_dc, new org.telegram.ui.Components.q61(1, va1Var, this.r));
    }

    @Override // org.telegram.ui.fa1
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
                ha1 ha1Var = this.r;
                ha1Var.e = new jg.e(ha1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            va1 va1Var = this.w;
            va1.W(va1Var);
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) va1Var.U.get(str);
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
            ua1 ua1Var = new ua1();
            va1Var.Y = ua1Var;
            va1Var.S.getClass();
            ua1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new is0(this, str, ua1Var, 10), null, null, 0, va1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) va1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.fa1
    public final void f() {
        va1.W(this.w);
    }
}
