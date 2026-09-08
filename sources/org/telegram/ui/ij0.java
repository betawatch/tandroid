package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class ij0 extends la1 {
    public final /* synthetic */ jj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ij0(jj0 jj0Var, Context context, int i10, jg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = jj0Var;
    }

    @Override // org.telegram.ui.la1
    public final void c() {
        int i10;
        int i11;
        int i12;
        lj0 lj0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                na1 na1Var = this.r;
                na1Var.e = new kg.e(na1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) lj0Var.v.get(str);
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
            ab1 ab1Var = new ab1();
            lj0Var.w = ab1Var;
            lj0Var.f.getClass();
            ab1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) lj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, ab1Var, 25), null, null, 0, lj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) lj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) lj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.la1
    public final void f() {
        jj0 jj0Var = this.v;
        lj0 lj0Var = jj0Var.d;
        ab1 ab1Var = lj0Var.w;
        if (ab1Var != null) {
            ab1Var.b = true;
        }
        int childCount = lj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = jj0Var.d.f.getChildAt(i10);
            if (childAt instanceof la1) {
                ((la1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.la1
    public final void b(na1 na1Var) {
    }
}
