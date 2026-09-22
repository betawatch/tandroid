package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class gj0 extends ja1 {
    public final /* synthetic */ hj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gj0(hj0 hj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, fVar, e6Var);
        this.v = hj0Var;
    }

    @Override // org.telegram.ui.ja1
    public final void c() {
        int i10;
        int i11;
        int i12;
        jj0 jj0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        ig.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                la1 la1Var = this.r;
                la1Var.e = new jg.e(la1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) jj0Var.v.get(str);
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
            ya1 ya1Var = new ya1();
            jj0Var.w = ya1Var;
            jj0Var.f.getClass();
            ya1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) jj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, ya1Var, 25), null, null, 0, jj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) jj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) jj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.ja1
    public final void f() {
        hj0 hj0Var = this.v;
        jj0 jj0Var = hj0Var.d;
        ya1 ya1Var = jj0Var.w;
        if (ya1Var != null) {
            ya1Var.b = true;
        }
        int childCount = jj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = hj0Var.d.f.getChildAt(i10);
            if (childAt instanceof ja1) {
                ((ja1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ja1
    public final void b(la1 la1Var) {
    }
}
