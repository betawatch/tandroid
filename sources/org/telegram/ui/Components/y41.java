package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-d78a0c589da3eb5af18b0124af787db3a92715981032555471643c0389950a57 */
/* loaded from: classes3.dex */
public final class y41 extends s4.s0 {
    public final /* synthetic */ f51 a;

    public y41(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.a.y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        f51 f51Var = this.a;
        e51 e51Var = f51Var.s;
        v41 v41Var = f51Var.n;
        s4.s0 s0Var = f51Var.y;
        if (s0Var != null) {
            s0Var.b(v41Var, i10, i11);
        }
        if (i11 <= 0 || v41Var.getAdapter() != e51Var || !f51Var.J || e51Var.r || e51Var.s) {
            return;
        }
        if (f51Var.r.N0() >= ((e51Var.w + 1) - ((e51Var.v + 1) * 10)) - 1) {
            f51 f51Var2 = e51Var.x;
            if (!f51Var2.J || e51Var.r || e51Var.s) {
                return;
            }
            e51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = e51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(f51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(e51Var, 17));
        }
    }
}
