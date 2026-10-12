package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-3c12e33287fbb2ce9486607f172b60a6e11d5f90866ff33993704227d9627b1d */
/* loaded from: classes3.dex */
public final class nj0 extends ra1 {
    public final /* synthetic */ oj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nj0(oj0 oj0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = oj0Var;
    }

    @Override // org.telegram.ui.ra1
    public final void c() {
        int i10;
        int i11;
        int i12;
        qj0 qj0Var = this.v.d;
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
            kg.b bVar = (kg.b) qj0Var.v.get(str);
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
            qj0Var.w = gb1Var;
            qj0Var.f.getClass();
            gb1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.m2) qj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new fa(this, str, gb1Var, 25), null, null, 0, qj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.m2) qj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.m2) qj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.ra1
    public final void f() {
        oj0 oj0Var = this.v;
        qj0 qj0Var = oj0Var.d;
        gb1 gb1Var = qj0Var.w;
        if (gb1Var != null) {
            gb1Var.b = true;
        }
        int childCount = qj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = oj0Var.d.f.getChildAt(i10);
            if (childAt instanceof ra1) {
                ((ra1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ra1
    public final void b(ta1 ta1Var) {
    }
}
