package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-90c74b6d1af88fe423a82a48cb36c0781986d7c98a26085f38aeb2edc71128ad */
/* loaded from: classes3.dex */
public final class v51 extends s4.s0 {
    public final /* synthetic */ c61 a;

    public v51(c61 c61Var) {
        this.a = c61Var;
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
        c61 c61Var = this.a;
        b61 b61Var = c61Var.s;
        s51 s51Var = c61Var.n;
        s4.s0 s0Var = c61Var.y;
        if (s0Var != null) {
            s0Var.b(s51Var, i10, i11);
        }
        if (i11 <= 0 || s51Var.getAdapter() != b61Var || !c61Var.J || b61Var.r || b61Var.s) {
            return;
        }
        if (c61Var.r.N0() >= ((b61Var.w + 1) - ((b61Var.v + 1) * 10)) - 1) {
            c61 c61Var2 = b61Var.x;
            if (!c61Var2.J || b61Var.r || b61Var.s) {
                return;
            }
            b61Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = b61Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(c61Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(b61Var, 17));
        }
    }
}
