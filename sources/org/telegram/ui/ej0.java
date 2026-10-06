package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-995671d6bce0aaeb91824b65f2f1988c5410eae59f1d5d7c368a0027313cc0ad */
/* loaded from: classes3.dex */
public final class ej0 extends da1 {
    public final /* synthetic */ fj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ej0(fj0 fj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = fj0Var;
    }

    @Override // org.telegram.ui.da1
    public final void c() {
        int i10;
        int i11;
        int i12;
        hj0 hj0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        ig.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                fa1 fa1Var = this.r;
                fa1Var.e = new jg.e(fa1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) hj0Var.v.get(str);
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
            sa1 sa1Var = new sa1();
            hj0Var.w = sa1Var;
            hj0Var.f.getClass();
            sa1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) hj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ca(this, str, sa1Var, 25), null, null, 0, hj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) hj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) hj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.da1
    public final void f() {
        fj0 fj0Var = this.v;
        hj0 hj0Var = fj0Var.d;
        sa1 sa1Var = hj0Var.w;
        if (sa1Var != null) {
            sa1Var.b = true;
        }
        int childCount = hj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = fj0Var.d.f.getChildAt(i10);
            if (childAt instanceof da1) {
                ((da1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.da1
    public final void b(fa1 fa1Var) {
    }
}
