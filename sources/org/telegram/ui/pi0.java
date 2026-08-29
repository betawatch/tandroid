package org.telegram.ui;

import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stats;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class pi0 extends d91 {
    public final /* synthetic */ qi0 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pi0(qi0 qi0Var, Context context, int i10, tf.f fVar, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, i10, fVar, c6Var);
        this.v = qi0Var;
    }

    @Override // org.telegram.ui.d91
    public final void c() {
        int i10;
        int i11;
        int i12;
        si0 si0Var = this.v.d;
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
            f();
            String str = this.r.g + "_" + selectedDate;
            uf.b bVar = (uf.b) si0Var.v.get(str);
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
            si0Var.w = s91Var;
            si0Var.f.getClass();
            s91Var.a = RecyclerView.R(this);
            gVar.p0.d(true, false);
            i10 = ((org.telegram.ui.ActionBar.o2) si0Var).currentAccount;
            int sendRequest = ConnectionsManager.getInstance(i10).sendRequest(tL_loadAsyncGraph, new x9(this, str, s91Var, 25), null, null, 0, si0Var.a.stats_dc, 1, true);
            i11 = ((org.telegram.ui.ActionBar.o2) si0Var).currentAccount;
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i11);
            i12 = ((org.telegram.ui.ActionBar.o2) si0Var).classGuid;
            connectionsManager.bindRequestToGuid(sendRequest, i12);
        }
    }

    @Override // org.telegram.ui.d91
    public final void f() {
        qi0 qi0Var = this.v;
        si0 si0Var = qi0Var.d;
        s91 s91Var = si0Var.w;
        if (s91Var != null) {
            s91Var.b = true;
        }
        int childCount = si0Var.f.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = qi0Var.d.f.getChildAt(i10);
            if (childAt instanceof d91) {
                ((d91) childAt).b.p0.d(false, true);
            }
        }
    }

    @Override // org.telegram.ui.d91
    public final void b(f91 f91Var) {
    }
}
