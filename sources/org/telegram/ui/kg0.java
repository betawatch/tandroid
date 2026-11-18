package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-a32da3a578b75970e97c101a53c8e7cdeb0e2fb6862be2d20329b7eb4b02756b */
/* loaded from: classes3.dex */
public final class kg0 extends m41 {
    public final /* synthetic */ lg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kg0(lg0 lg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, fVar, i6Var);
        this.w = lg0Var;
    }

    @Override // org.telegram.ui.m41
    public final void c() {
        int i7;
        int i10;
        int i11;
        ng0 ng0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.u0.H) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                o41 o41Var = this.r;
                o41Var.e = new mg.e(o41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) ng0Var.w.f(str);
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
            b51 b51Var = new b51();
            ng0Var.x = b51Var;
            ng0Var.f.getClass();
            b51Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            i7 = ((org.telegram.ui.ActionBar.h2) ng0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, b51Var, 25), null, null, 0, ng0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.h2) ng0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.h2) ng0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.m41
    public final void f() {
        lg0 lg0Var = this.w;
        ng0 ng0Var = lg0Var.d;
        b51 b51Var = ng0Var.x;
        if (b51Var != null) {
            b51Var.b = true;
        }
        int childCount = ng0Var.f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = lg0Var.d.f.getChildAt(i7);
            if (childAt instanceof m41) {
                ((m41) childAt).b.u0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.m41
    public final void b(o41 o41Var) {
    }
}
