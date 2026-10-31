package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bb1e18cc956ebcca5abc3b5ecd775be1420d1605c8f463ed7550ade4eefd26ab */
/* loaded from: classes3.dex */
public final class o41 extends s4.s0 {
    public final /* synthetic */ w41 a;

    public o41(w41 w41Var) {
        this.a = w41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        w41 w41Var = this.a;
        v41 v41Var = w41Var.s;
        l41 l41Var = w41Var.n;
        s4.s0 s0Var = w41Var.D;
        if (s0Var != null) {
            s0Var.b(l41Var, i10, i11);
        }
        if (i11 <= 0 || l41Var.getAdapter() != v41Var || !w41Var.J || v41Var.r || v41Var.s) {
            return;
        }
        if (w41Var.r.N0() >= ((v41Var.x + 1) - ((v41Var.w + 1) * 10)) - 1) {
            w41 w41Var2 = v41Var.y;
            if (!w41Var2.J || v41Var.r || v41Var.s) {
                return;
            }
            v41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = v41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(w41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(v41Var, 16));
        }
    }
}
