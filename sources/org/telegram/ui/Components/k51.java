package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-55c51131a4e3e5b800077d6b571ddc9a5a11ae13728b5823d570600aeb3bdcdf */
/* loaded from: classes3.dex */
public final class k51 extends s4.s0 {
    public final /* synthetic */ r51 a;

    public k51(r51 r51Var) {
        this.a = r51Var;
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
        r51 r51Var = this.a;
        q51 q51Var = r51Var.s;
        h51 h51Var = r51Var.n;
        s4.s0 s0Var = r51Var.y;
        if (s0Var != null) {
            s0Var.b(h51Var, i10, i11);
        }
        if (i11 <= 0 || h51Var.getAdapter() != q51Var || !r51Var.J || q51Var.r || q51Var.s) {
            return;
        }
        if (r51Var.r.N0() >= ((q51Var.w + 1) - ((q51Var.v + 1) * 10)) - 1) {
            r51 r51Var2 = q51Var.x;
            if (!r51Var2.J || q51Var.r || q51Var.s) {
                return;
            }
            q51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = q51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(r51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new z1(q51Var, 17));
        }
    }
}
