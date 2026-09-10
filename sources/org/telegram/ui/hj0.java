package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class hj0 extends pa1 {
    public final /* synthetic */ ij0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hj0(ij0 ij0Var, Context context, int i10, hg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i10, fVar, f6Var);
        this.v = ij0Var;
    }

    @Override // org.telegram.ui.pa1
    public final void c() {
        int i10;
        int i11;
        int i12;
        kj0 kj0Var = this.v.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        hg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                ra1 ra1Var = this.r;
                ra1Var.e = new ig.e(ra1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            ig.b bVar = (ig.b) kj0Var.v.get(str);
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
            eb1 eb1Var = new eb1();
            kj0Var.w = eb1Var;
            kj0Var.f.getClass();
            eb1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.p2) kj0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, eb1Var, 25), null, null, 0, kj0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.p2) kj0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.p2) kj0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.pa1
    public final void f() {
        ij0 ij0Var = this.v;
        kj0 kj0Var = ij0Var.d;
        eb1 eb1Var = kj0Var.w;
        if (eb1Var != null) {
            eb1Var.b = true;
        }
        int childCount = kj0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = ij0Var.d.f.getChildAt(i10);
            if (childAt instanceof pa1) {
                ((pa1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.pa1
    public final void b(ra1 ra1Var) {
    }
}
