package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class ph0 extends e61 {
    public final /* synthetic */ qh0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ph0(qh0 qh0Var, Context context, int i10, bg.h hVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, hVar, p6Var);
        this.w = qh0Var;
    }

    @Override // org.telegram.ui.e61
    public final void c() {
        int i10;
        int i11;
        int i12;
        sh0 sh0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        bg.i iVar = this.b;
        if (iVar.t0.G) {
            long selectedDate = iVar.getSelectedDate();
            if (this.s == 4) {
                g61 g61Var = this.r;
                g61Var.e = new cg.e(g61Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            cg.b bVar = (cg.b) sh0Var.w.f(str);
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
            t61 t61Var = new t61();
            sh0Var.x = t61Var;
            sh0Var.f.getClass();
            t61Var.a = RecyclerView.R(this);
            iVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.k2) sh0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, t61Var, 25), null, null, 0, sh0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.k2) sh0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.k2) sh0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.e61
    public final void f() {
        qh0 qh0Var = this.w;
        sh0 sh0Var = qh0Var.d;
        t61 t61Var = sh0Var.x;
        if (t61Var != null) {
            t61Var.b = true;
        }
        int childCount = sh0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qh0Var.d.f.getChildAt(i10);
            if (childAt instanceof e61) {
                ((e61) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.e61
    public final void b(g61 g61Var) {
    }
}
