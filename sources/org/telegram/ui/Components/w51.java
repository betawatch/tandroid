package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-8e647ea09dd204f7fa56b0790cd1c6c7931fe567b34678ab0d221a9ad6af8f53 */
/* loaded from: classes3.dex */
public final class w51 extends s4.s0 {
    public final /* synthetic */ d61 a;

    public w51(d61 d61Var) {
        this.a = d61Var;
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
        d61 d61Var = this.a;
        c61 c61Var = d61Var.s;
        t51 t51Var = d61Var.n;
        s4.s0 s0Var = d61Var.y;
        if (s0Var != null) {
            s0Var.b(t51Var, i10, i11);
        }
        if (i11 <= 0 || t51Var.getAdapter() != c61Var || !d61Var.J || c61Var.r || c61Var.s) {
            return;
        }
        if (d61Var.r.N0() >= ((c61Var.w + 1) - ((c61Var.v + 1) * 10)) - 1) {
            d61 d61Var2 = c61Var.x;
            if (!d61Var2.J || c61Var.r || c61Var.s) {
                return;
            }
            c61Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = c61Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(d61Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(c61Var, 17));
        }
    }
}
