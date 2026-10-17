package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-189a3a12219b7c214453a48fa9697387dfb8b2ca31ce3a2eba70ff5e2610a248 */
/* loaded from: classes3.dex */
public abstract class c91 extends b91 {
    public final int v;
    public final /* synthetic */ r91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c91(r91 r91Var, Context context, int i10, int i11, jg.f fVar) {
        super(context, i11, fVar, null);
        this.w = r91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.b91
    public final void b(d91 d91Var) {
        int i10;
        r91 r91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.n2) r91Var).classGuid;
        d91Var.a(this.v, i10, r91Var.a.stats_dc, new qh(2, r91Var, this.r));
    }

    @Override // org.telegram.ui.b91
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        jg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                d91 d91Var = this.r;
                d91Var.e = new kg.e(d91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            r91 r91Var = this.w;
            r91.Z(r91Var);
            String str = this.r.g + "_" + selectedDate;
            kg.b bVar = (kg.b) r91Var.V.get(str);
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
            q91 q91Var = new q91();
            r91Var.Z = q91Var;
            r91Var.S.getClass();
            q91Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new vr0(this, str, q91Var, 10), null, null, 0, r91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.n2) r91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.b91
    public final void f() {
        r91.Z(this.w);
    }
}
