package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e9be2e8928caae39c37b14acc2083317da263a6f1414814df554d3ad0d46aba8 */
/* loaded from: classes3.dex */
public final class y41 extends f2.a1 {
    public final /* synthetic */ f51 a;

    public y41(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        f2.a1 a1Var = this.a.y;
        if (a1Var != null) {
            a1Var.a(recyclerView, i10);
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f51 f51Var = this.a;
        e51 e51Var = f51Var.s;
        v41 v41Var = f51Var.n;
        f2.a1 a1Var = f51Var.y;
        if (a1Var != null) {
            a1Var.b(v41Var, i10, i11);
        }
        if (i11 <= 0 || v41Var.getAdapter() != e51Var || !f51Var.G || e51Var.r || e51Var.s) {
            return;
        }
        if (f51Var.r.N0() >= ((e51Var.w + 1) - ((e51Var.v + 1) * 10)) - 1) {
            f51 f51Var2 = e51Var.x;
            if (!f51Var2.G || e51Var.r || e51Var.s) {
                return;
            }
            e51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = e51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(f51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(e51Var, 17));
        }
    }
}
