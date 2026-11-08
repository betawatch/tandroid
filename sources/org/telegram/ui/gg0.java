package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-5721f848fd1d566b554f20aa5327343ffc22208e2c0d7170c4734a0b506870f4 */
/* loaded from: classes3.dex */
public final class gg0 extends l41 {
    public final /* synthetic */ hg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gg0(hg0 hg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, i7, fVar, f6Var);
        this.w = hg0Var;
    }

    @Override // org.telegram.ui.l41
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
        if (gVar.t0.G) {
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
            b51 b51Var = new b51();
            jg0Var.x = b51Var;
            jg0Var.f.getClass();
            b51Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i7 = ((org.telegram.ui.ActionBar.f2) jg0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, b51Var, 25), null, null, 0, jg0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.f2) jg0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.f2) jg0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.l41
    public final void f() {
        hg0 hg0Var = this.w;
        jg0 jg0Var = hg0Var.d;
        b51 b51Var = jg0Var.x;
        if (b51Var != null) {
            b51Var.b = true;
        }
        int childCount = jg0Var.f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = hg0Var.d.f.getChildAt(i7);
            if (childAt instanceof l41) {
                ((l41) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.l41
    public final void b(o41 o41Var) {
    }
}
