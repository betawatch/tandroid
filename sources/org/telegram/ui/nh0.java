package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class nh0 extends c61 {
    public final /* synthetic */ oh0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nh0(oh0 oh0Var, Context context, int i10, bg.h hVar, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, i10, hVar, p6Var);
        this.w = oh0Var;
    }

    @Override // org.telegram.ui.c61
    public final void c() {
        int i10;
        int i11;
        int i12;
        qh0 qh0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        bg.i iVar = this.b;
        if (iVar.t0.G) {
            long selectedDate = iVar.getSelectedDate();
            if (this.s == 4) {
                e61 e61Var = this.r;
                e61Var.e = new cg.e(e61Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            cg.b bVar = (cg.b) qh0Var.w.f(str);
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
            r61 r61Var = new r61();
            qh0Var.x = r61Var;
            qh0Var.f.getClass();
            r61Var.a = RecyclerView.R(this);
            iVar.t0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.k2) qh0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new aa(this, str, r61Var, 25), null, null, 0, qh0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.k2) qh0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.k2) qh0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.c61
    public final void f() {
        oh0 oh0Var = this.w;
        qh0 qh0Var = oh0Var.d;
        r61 r61Var = qh0Var.x;
        if (r61Var != null) {
            r61Var.b = true;
        }
        int childCount = qh0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = oh0Var.d.f.getChildAt(i10);
            if (childAt instanceof c61) {
                ((c61) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.c61
    public final void b(e61 e61Var) {
    }
}
