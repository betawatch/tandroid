package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class mj0 extends ra1 {
    public final /* synthetic */ nj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj0(nj0 nj0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = nj0Var;
    }

    @Override // org.telegram.ui.ra1
    public final void c() {
        int i10;
        int i11;
        int i12;
        pj0 pj0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                ta1 ta1Var = this.r;
                ta1Var.e = new kg.e(ta1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) pj0Var.v.get(str);
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
            gb1 gb1Var = new gb1();
            pj0Var.w = gb1Var;
            pj0Var.f.getClass();
            gb1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.m2) pj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new fa(this, str, gb1Var, 25), null, null, 0, pj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.m2) pj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.m2) pj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.ra1
    public final void f() {
        nj0 nj0Var = this.v;
        pj0 pj0Var = nj0Var.d;
        gb1 gb1Var = pj0Var.w;
        if (gb1Var != null) {
            gb1Var.b = true;
        }
        int childCount = pj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = nj0Var.d.f.getChildAt(i10);
            if (childAt instanceof ra1) {
                ((ra1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ra1
    public final void b(ta1 ta1Var) {
    }
}
