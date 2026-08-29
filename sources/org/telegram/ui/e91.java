package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public abstract class e91 extends d91 {
    public final int v;
    public final /* synthetic */ t91 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e91(t91 t91Var, Context context, int i10, int i11, tf.f fVar) {
        super(context, i11, fVar, null);
        this.w = t91Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.d91
    public final void b(f91 f91Var) {
        int i10;
        t91 t91Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.o2) t91Var).classGuid;
        f91Var.a(this.v, i10, t91Var.a.stats_dc, new org.telegram.ui.Components.g51(1, t91Var, this.r));
    }

    @Override // org.telegram.ui.d91
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        tf.g gVar = this.b;
        if (gVar.p0.C) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                f91 f91Var = this.r;
                f91Var.e = new uf.e(f91Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            t91 t91Var = this.w;
            t91.Z(t91Var);
            String str = this.r.g + "_" + selectedDate;
            uf.b bVar = (uf.b) t91Var.R.get(str);
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
            s91 s91Var = new s91();
            t91Var.V = s91Var;
            t91Var.O.getClass();
            s91Var.a = RecyclerView.R(this);
            gVar.p0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new jr0(this, str, s91Var, 10), null, null, 0, t91Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.o2) t91Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.d91
    public final void f() {
        t91.Z(this.w);
    }
}
