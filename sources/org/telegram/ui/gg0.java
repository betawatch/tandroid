package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-67e6279fa6784b9b38f462e6fa99e7dfd910e42378764591e2cbed55febcd96c */
/* loaded from: classes3.dex */
public final class gg0 extends j41 {
    public final /* synthetic */ hg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg0(hg0 hg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, i7, fVar, e6Var);
        this.w = hg0Var;
    }

    @Override // org.telegram.ui.j41
    public final void c() {
        int i7;
        int i10;
        int i11;
        jg0 jg0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.u0.H) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                l41 l41Var = this.r;
                l41Var.e = new mg.e(l41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) jg0Var.w.f(str);
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
            y41 y41Var = new y41();
            jg0Var.x = y41Var;
            jg0Var.f.getClass();
            y41Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            i7 = ((org.telegram.ui.ActionBar.e2) jg0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, y41Var, 25), null, null, 0, jg0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.e2) jg0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.e2) jg0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.j41
    public final void f() {
        hg0 hg0Var = this.w;
        jg0 jg0Var = hg0Var.d;
        y41 y41Var = jg0Var.x;
        if (y41Var != null) {
            y41Var.b = true;
        }
        int childCount = jg0Var.f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = hg0Var.d.f.getChildAt(i7);
            if (childAt instanceof j41) {
                ((j41) childAt).b.u0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.j41
    public final void b(l41 l41Var) {
    }
}
