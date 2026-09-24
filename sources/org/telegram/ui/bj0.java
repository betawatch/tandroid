package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-b07cfdfd75409cd6350aa76f4fec680e8237f25f7a223b1e5148659feab2c2d2 */
/* loaded from: classes3.dex */
public final class bj0 extends ca1 {
    public final /* synthetic */ cj0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj0(cj0 cj0Var, Context context, int i10, ig.f fVar, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, i10, fVar, d6Var);
        this.v = cj0Var;
    }

    @Override // org.telegram.ui.ca1
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
                ea1 ea1Var = this.r;
                ea1Var.e = new jg.e(ea1Var.d, selectedDate);
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
            ra1 ra1Var = new ra1();
            ej0Var.w = ra1Var;
            ej0Var.f.getClass();
            ra1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.m2) ej0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, ra1Var, 25), null, null, 0, ej0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.m2) ej0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.m2) ej0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.ca1
    public final void f() {
        cj0 cj0Var = this.v;
        ej0 ej0Var = cj0Var.d;
        ra1 ra1Var = ej0Var.w;
        if (ra1Var != null) {
            ra1Var.b = true;
        }
        int childCount = ej0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = cj0Var.d.f.getChildAt(i10);
            if (childAt instanceof ca1) {
                ((ca1) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.ca1
    public final void b(ea1 ea1Var) {
    }
}
