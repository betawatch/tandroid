package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e506a87262d42a59d49ceeb11de21243ca58d8dd989db9ff2eb23aa08d8dd348 */
/* loaded from: classes3.dex */
public final class x41 extends s4.s0 {
    public final /* synthetic */ e51 a;

    public x41(e51 e51Var) {
        this.a = e51Var;
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
        e51 e51Var = this.a;
        d51 d51Var = e51Var.s;
        u41 u41Var = e51Var.n;
        s4.s0 s0Var = e51Var.y;
        if (s0Var != null) {
            s0Var.b(u41Var, i10, i11);
        }
        if (i11 <= 0 || u41Var.getAdapter() != d51Var || !e51Var.J || d51Var.r || d51Var.s) {
            return;
        }
        if (e51Var.r.N0() >= ((d51Var.w + 1) - ((d51Var.v + 1) * 10)) - 1) {
            e51 e51Var2 = d51Var.x;
            if (!e51Var2.J || d51Var.r || d51Var.s) {
                return;
            }
            d51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = d51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(e51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(d51Var, 17));
        }
    }
}
