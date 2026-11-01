package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public abstract class d61 extends c61 {
    public final int w;
    public final /* synthetic */ s61 x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d61(s61 s61Var, Context context, int i10, int i11, bg.h hVar) {
        super(context, i11, hVar, null);
        this.x = s61Var;
        this.w = i10;
    }

    @Override // org.telegram.ui.c61
    public final void b(e61 e61Var) {
        int i10;
        s61 s61Var = this.x;
        i10 = ((org.telegram.ui.ActionBar.k2) s61Var).classGuid;
        e61Var.a(this.w, i10, s61Var.a.stats_dc, new uh(2, s61Var, this.r));
    }

    @Override // org.telegram.ui.c61
    public final void c() {
        int i10;
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
            s61 s61Var = this.x;
            s61.c0(s61Var);
            String str = this.r.g + "_" + selectedDate;
            cg.b bVar = (cg.b) s61Var.U.f(str);
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
            s61Var.Y = r61Var;
            s61Var.S.getClass();
            r61Var.a = RecyclerView.R(this);
            iVar.t0.d(true, false);
            int i11 = this.w;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new tp0(this, str, r61Var, 10), null, null, 0, s61Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.k2) s61Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.c61
    public final void f() {
        s61.c0(this.x);
    }
}
