package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class ig0 extends m41 {
    public final /* synthetic */ jg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ig0(jg0 jg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, i7, fVar, g6Var);
        this.w = jg0Var;
    }

    @Override // org.telegram.ui.m41
    public final void c() {
        int i7;
        int i10;
        int i11;
        lg0 lg0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                p41 p41Var = this.r;
                p41Var.e = new mg.e(p41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) lg0Var.w.f(str);
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
            c51 c51Var = new c51();
            lg0Var.x = c51Var;
            lg0Var.f.getClass();
            c51Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i7 = ((org.telegram.ui.ActionBar.f2) lg0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, c51Var, 25), null, null, 0, lg0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.f2) lg0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.f2) lg0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.m41
    public final void f() {
        jg0 jg0Var = this.w;
        lg0 lg0Var = jg0Var.d;
        c51 c51Var = lg0Var.x;
        if (c51Var != null) {
            c51Var.b = true;
        }
        int childCount = lg0Var.f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = jg0Var.d.f.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.m41
    public final void b(p41 p41Var) {
    }
}
