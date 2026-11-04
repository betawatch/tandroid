package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class ag0 extends b41 {
    public final /* synthetic */ bg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag0(bg0 bg0Var, Context context, int i3, mg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i3, fVar, e6Var);
        this.w = bg0Var;
    }

    @Override // org.telegram.ui.b41
    public final void c() {
        int i3;
        int i10;
        int i11;
        dg0 dg0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        mg.g gVar = this.b;
        if (gVar.u0.H) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                d41 d41Var = this.r;
                d41Var.e = new ng.e(d41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            ng.b bVar = (ng.b) dg0Var.w.f(str);
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
            q41 q41Var = new q41();
            dg0Var.x = q41Var;
            dg0Var.f.getClass();
            q41Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            i3 = ((org.telegram.ui.ActionBar.d2) dg0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i3).sendRequest(tL_loadAsyncGraph, new y9(this, str, q41Var, 25), null, null, 0, dg0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.d2) dg0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.d2) dg0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.b41
    public final void f() {
        bg0 bg0Var = this.w;
        dg0 dg0Var = bg0Var.d;
        q41 q41Var = dg0Var.x;
        if (q41Var != null) {
            q41Var.b = true;
        }
        int childCount = dg0Var.f.getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = bg0Var.d.f.getChildAt(i3);
            if (childAt instanceof b41) {
                ((b41) childAt).b.u0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.b41
    public final void b(d41 d41Var) {
    }
}
