package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-604327a55faa45f8c448443d3bbcc0b388776b2c5ab434dc7b56c8748365860a */
/* loaded from: classes3.dex */
public final class n51 extends s4.s0 {
    public final /* synthetic */ u51 a;

    public n51(u51 u51Var) {
        this.a = u51Var;
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
        u51 u51Var = this.a;
        t51 t51Var = u51Var.s;
        k51 k51Var = u51Var.n;
        s4.s0 s0Var = u51Var.y;
        if (s0Var != null) {
            s0Var.b(k51Var, i10, i11);
        }
        if (i11 <= 0 || k51Var.getAdapter() != t51Var || !u51Var.J || t51Var.r || t51Var.s) {
            return;
        }
        if (u51Var.r.N0() >= ((t51Var.w + 1) - ((t51Var.v + 1) * 10)) - 1) {
            u51 u51Var2 = t51Var.x;
            if (!u51Var2.J || t51Var.r || t51Var.s) {
                return;
            }
            t51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = t51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(u51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(t51Var, 17));
        }
    }
}
