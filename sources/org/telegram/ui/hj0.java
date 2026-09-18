package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-33b1d79182603e8304c32e909c352797304d7e7816a08740f96af6cffe97caab */
/* loaded from: classes3.dex */
public final class hj0 extends ja1 {
    public final /* synthetic */ ij0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(ij0 ij0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i10, fVar, e6Var);
        this.v = ij0Var;
    }

    @Override // org.telegram.ui.ja1
    public final void c() {
        int i10;
        int i11;
        int i12;
        kj0 kj0Var = this.v.d;
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
            jg.b bVar = (jg.b) kj0Var.v.get(str);
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
            kj0Var.w = ya1Var;
            kj0Var.f.getClass();
            ya1Var.a = RecyclerView.S(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) kj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new ba(this, str, ya1Var, 25), null, null, 0, kj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) kj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) kj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.ja1
    public final void f() {
        ij0 ij0Var = this.v;
        kj0 kj0Var = ij0Var.d;
        ya1 ya1Var = kj0Var.w;
        if (ya1Var != null) {
            ya1Var.b = true;
        }
        int childCount = kj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ij0Var.d.f.getChildAt(i10);
            if (childAt instanceof ja1) {
                ((ja1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ja1
    public final void b(la1 la1Var) {
    }
}
