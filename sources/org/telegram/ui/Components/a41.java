package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-11b2057e7e9050c40bb40722946bba2b5eb90c231d630684b08af6cb92d5aac3 */
/* loaded from: classes3.dex */
public final class a41 extends f2.d1 {
    public final /* synthetic */ h41 a;

    public a41(h41 h41Var) {
        this.a = h41Var;
    }

    @Override // f2.d1
    public final void a(RecyclerView recyclerView, int i9) {
        f2.d1 d1Var = this.a.y;
        if (d1Var != null) {
            d1Var.a(recyclerView, i9);
        }
    }

    @Override // f2.d1
    public final void b(RecyclerView recyclerView, int i9, int i10) {
        h41 h41Var = this.a;
        g41 g41Var = h41Var.s;
        x31 x31Var = h41Var.n;
        f2.d1 d1Var = h41Var.y;
        if (d1Var != null) {
            d1Var.b(x31Var, i9, i10);
        }
        if (i10 <= 0 || x31Var.getAdapter() != g41Var || !h41Var.F || g41Var.r || g41Var.s) {
            return;
        }
        if (h41Var.r.N0() >= ((g41Var.w + 1) - ((g41Var.v + 1) * 10)) - 1) {
            h41 h41Var2 = g41Var.x;
            if (!h41Var2.F || g41Var.r || g41Var.s) {
                return;
            }
            g41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = g41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(h41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(g41Var, 17));
        }
    }
}
