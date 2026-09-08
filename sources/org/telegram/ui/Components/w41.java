package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-fc8091fbf48934909e0e4bbf4c2510a13915b1f3367c1e4641e44f77ea5701eb */
/* loaded from: classes3.dex */
public final class w41 extends s4.s0 {
    public final /* synthetic */ d51 a;

    public w41(d51 d51Var) {
        this.a = d51Var;
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
        d51 d51Var = this.a;
        c51 c51Var = d51Var.s;
        t41 t41Var = d51Var.n;
        s4.s0 s0Var = d51Var.y;
        if (s0Var != null) {
            s0Var.b(t41Var, i10, i11);
        }
        if (i11 <= 0 || t41Var.getAdapter() != c51Var || !d51Var.J || c51Var.r || c51Var.s) {
            return;
        }
        if (d51Var.r.N0() >= ((c51Var.w + 1) - ((c51Var.v + 1) * 10)) - 1) {
            d51 d51Var2 = c51Var.x;
            if (!d51Var2.J || c51Var.r || c51Var.s) {
                return;
            }
            c51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = c51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(d51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c51Var, 17));
        }
    }
}
