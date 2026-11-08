package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-ca04df91cdb59d1def540c39f99d029629c9e89d5664364400b5b6c4571f3bb8 */
/* loaded from: classes3.dex */
public abstract class m41 extends l41 {
    public final int w;
    public final /* synthetic */ c51 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m41(c51 c51Var, Context context, int i7, int i10, lg.f fVar) {
        super(context, i10, fVar, null);
        this.x = c51Var;
        this.w = i7;
    }

    @Override // org.telegram.ui.l41
    public final void b(o41 o41Var) {
        int i7;
        c51 c51Var = this.x;
        i7 = ((org.telegram.ui.ActionBar.f2) c51Var).classGuid;
        o41Var.a(this.w, i7, c51Var.a.stats_dc, new eh(2, c51Var, this.r));
    }

    @Override // org.telegram.ui.l41
    public final void c() {
        int i7;
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
            c51 c51Var = this.x;
            c51.c0(c51Var);
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) c51Var.U.f(str);
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
            c51Var.Y = b51Var;
            c51Var.S.getClass();
            b51Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i10 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new lo0(this, str, b51Var, 10), null, null, 0, c51Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i7 = ((org.telegram.ui.ActionBar.f2) c51Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i7);
        }
    }

    @Override // org.telegram.ui.l41
    public final void f() {
        c51.c0(this.x);
    }
}
