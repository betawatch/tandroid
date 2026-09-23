package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6335c94831679a0293b86ea4f052582819b91dec8a01539705019c10615f050f */
/* loaded from: classes3.dex */
public final class bj0 extends ba1 {
    public final /* synthetic */ cj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(cj0 cj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = cj0Var;
    }

    @Override // org.telegram.ui.ba1
    public final void c() {
        int i10;
        int i11;
        int i12;
        ej0 ej0Var = this.v.d;
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
            f();
            String str = this.r.g + "_" + selectedDate;
            jg.b bVar = (jg.b) ej0Var.v.get(str);
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
            ej0Var.w = qa1Var;
            ej0Var.f.getClass();
            qa1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.n2) ej0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, qa1Var, 25), null, null, 0, ej0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.n2) ej0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.n2) ej0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.ba1
    public final void f() {
        cj0 cj0Var = this.v;
        ej0 ej0Var = cj0Var.d;
        qa1 qa1Var = ej0Var.w;
        if (qa1Var != null) {
            qa1Var.b = true;
        }
        int childCount = ej0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cj0Var.d.f.getChildAt(i10);
            if (childAt instanceof ba1) {
                ((ba1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ba1
    public final void b(da1 da1Var) {
    }
}
