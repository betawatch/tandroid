package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public abstract class m41 extends l41 {
    public final int w;
    public final /* synthetic */ b51 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(b51 b51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.x = b51Var;
        this.w = i7;
    }

    @Override // org.telegram.ui.l41
    public final void b(n41 n41Var) {
        int i7;
        b51 b51Var = this.x;
        i7 = ((org.telegram.ui.ActionBar.g2) b51Var).classGuid;
        n41Var.a(this.w, i7, b51Var.a.stats_dc, new fh(2, b51Var, this.r));
    }

    @Override // org.telegram.ui.l41
    public final void c() {
        int i7;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.u0.H) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                n41 n41Var = this.r;
                n41Var.e = new mg.e(n41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            b51 b51Var = this.x;
            b51.c0(b51Var);
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) b51Var.V.f(str);
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
            a51 a51Var = new a51();
            b51Var.Z = a51Var;
            b51Var.T.getClass();
            a51Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            int i10 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new mo0(this, str, a51Var, 10), null, null, 0, b51Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i7 = ((org.telegram.ui.ActionBar.g2) b51Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i7);
        }
    }

    @Override // org.telegram.ui.l41
    public final void f() {
        b51.c0(this.x);
    }
}
