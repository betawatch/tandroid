package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-a4c6b52504eee81d9989a27b4cad24aea8b0660ac2a1b1abfc07e23e193455ab */
/* loaded from: classes3.dex */
public final class a41 extends v4.u0 {
    public final /* synthetic */ h41 a;

    public a41(h41 h41Var) {
        this.a = h41Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        v4.u0 u0Var = this.a.E;
        if (u0Var != null) {
            u0Var.a(recyclerView, i7);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        h41 h41Var = this.a;
        g41 g41Var = h41Var.s;
        x31 x31Var = h41Var.n;
        v4.u0 u0Var = h41Var.E;
        if (u0Var != null) {
            u0Var.b(x31Var, i7, i10);
        }
        if (i10 <= 0 || x31Var.getAdapter() != g41Var || !h41Var.K || g41Var.r || g41Var.s) {
            return;
        }
        if (h41Var.r.N0() >= ((g41Var.x + 1) - ((g41Var.w + 1) * 10)) - 1) {
            h41 h41Var2 = g41Var.y;
            if (!h41Var2.K || g41Var.r || g41Var.s) {
                return;
            }
            g41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = g41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(h41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new e2(g41Var, 16));
        }
    }
}
