package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class g31 extends u4.t0 {
    public final /* synthetic */ n31 a;

    public g31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // u4.t0
    public final void a(RecyclerView recyclerView, int i3) {
        u4.t0 t0Var = this.a.E;
        if (t0Var != null) {
            t0Var.a(recyclerView, i3);
        }
    }

    @Override // u4.t0
    public final void b(RecyclerView recyclerView, int i3, int i10) {
        n31 n31Var = this.a;
        m31 m31Var = n31Var.s;
        d31 d31Var = n31Var.n;
        u4.t0 t0Var = n31Var.E;
        if (t0Var != null) {
            t0Var.b(d31Var, i3, i10);
        }
        if (i10 <= 0 || d31Var.getAdapter() != m31Var || !n31Var.K || m31Var.r || m31Var.s) {
            return;
        }
        if (n31Var.r.N0() >= ((m31Var.x + 1) - ((m31Var.w + 1) * 10)) - 1) {
            n31 n31Var2 = m31Var.y;
            if (!n31Var2.K || m31Var.r || m31Var.s) {
                return;
            }
            m31Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = m31Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(n31Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(m31Var, 16));
        }
    }
}
