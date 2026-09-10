package org.telegram.ui;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public abstract class qa1 extends pa1 {
    public final int v;
    public final /* synthetic */ fb1 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qa1(fb1 fb1Var, Context context, int i10, int i11, hg.f fVar) {
        super(context, i11, fVar, null);
        this.w = fb1Var;
        this.v = i10;
    }

    @Override // org.telegram.ui.pa1
    public final void b(ra1 ra1Var) {
        int i10;
        fb1 fb1Var = this.w;
        i10 = ((org.telegram.ui.ActionBar.p2) fb1Var).classGuid;
        ra1Var.a(this.v, i10, fb1Var.a.stats_dc, new org.telegram.ui.Components.f61(1, fb1Var, this.r));
    }

    @Override // org.telegram.ui.pa1
    public final void c() {
        int i10;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        hg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                ra1 ra1Var = this.r;
                ra1Var.e = new ig.e(ra1Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            fb1 fb1Var = this.w;
            fb1.Z(fb1Var);
            String str = this.r.g + "_" + selectedDate;
            ig.b bVar = (ig.b) fb1Var.V.get(str);
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
            eb1 eb1Var = new eb1();
            fb1Var.Z = eb1Var;
            fb1Var.S.getClass();
            eb1Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            int i11 = this.v;
            int sendRequest = ConnectionsManager.getInstance(i11).sendRequest(tL_loadAsyncGraph, new ms0(this, str, eb1Var, 10), null, null, 0, fb1Var.a.stats_dc, 1, true);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i10 = ((org.telegram.ui.ActionBar.p2) fb1Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i10);
        }
    }

    @Override // org.telegram.ui.pa1
    public final void f() {
        fb1.Z(this.w);
    }
}
