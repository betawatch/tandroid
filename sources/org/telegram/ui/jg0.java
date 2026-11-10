package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-909e39e720ff0bfd2a4dca1bd610340fb8e6f66f796564cc1df33797d3f7a011 */
/* loaded from: classes3.dex */
public final class jg0 extends n41 {
    public final /* synthetic */ kg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(kg0 kg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, i7, fVar, h6Var);
        this.w = kg0Var;
    }

    @Override // org.telegram.ui.n41
    public final void c() {
        int i7;
        int i10;
        int i11;
        mg0 mg0Var = this.w.d;
        if (this.r.c > 0) {
            return;
        }
        performClick();
        lg.g gVar = this.b;
        if (gVar.t0.G) {
            long selectedDate = gVar.getSelectedDate();
            if (this.s == 4) {
                q41 q41Var = this.r;
                q41Var.e = new mg.e(q41Var.d, selectedDate);
                g(false);
                return;
            }
            if (this.r.g == null) {
                return;
            }
            f();
            String str = this.r.g + "_" + selectedDate;
            mg.b bVar = (mg.b) mg0Var.w.f(str);
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
            d51 d51Var = new d51();
            mg0Var.x = d51Var;
            mg0Var.f.getClass();
            d51Var.a = RecyclerView.R(this);
            gVar.t0.d(true, false);
            i7 = ((org.telegram.ui.ActionBar.f2) mg0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, d51Var, 25), null, null, 0, mg0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.f2) mg0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.f2) mg0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.n41
    public final void f() {
        kg0 kg0Var = this.w;
        mg0 mg0Var = kg0Var.d;
        d51 d51Var = mg0Var.x;
        if (d51Var != null) {
            d51Var.b = true;
        }
        int childCount = mg0Var.f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = kg0Var.d.f.getChildAt(i7);
            if (childAt instanceof n41) {
                ((n41) childAt).b.t0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.n41
    public final void b(q41 q41Var) {
    }
}
