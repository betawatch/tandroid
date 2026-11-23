package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class jg0 extends l41 {
    public final /* synthetic */ kg0 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jg0(kg0 kg0Var, Context context, int i7, lg.f fVar, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, i7, fVar, i6Var);
        this.w = kg0Var;
    }

    @Override // org.telegram.ui.l41
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
            a51 a51Var = new a51();
            mg0Var.x = a51Var;
            mg0Var.f.getClass();
            a51Var.a = RecyclerView.R(this);
            gVar.u0.d(true, false);
            i7 = ((org.telegram.ui.ActionBar.g2) mg0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i7).sendRequest(tL_loadAsyncGraph, new z9(this, str, a51Var, 25), null, null, 0, mg0Var.a.stats_dc, 1, true);
            i10 = ((org.telegram.ui.ActionBar.g2) mg0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
            i11 = ((org.telegram.ui.ActionBar.g2) mg0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i11);
        }
    }

    @Override // org.telegram.ui.l41
    public final void f() {
        kg0 kg0Var = this.w;
        mg0 mg0Var = kg0Var.d;
        a51 a51Var = mg0Var.x;
        if (a51Var != null) {
            a51Var.b = true;
        }
        int childCount = mg0Var.f.getChildCount();
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = kg0Var.d.f.getChildAt(i7);
            if (childAt instanceof l41) {
                ((l41) childAt).b.u0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.l41
    public final void b(n41 n41Var) {
    }
}
