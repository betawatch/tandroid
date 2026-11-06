package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-93b428070cbd7f9496f847e5fe7d744100d14eb93ffe33213c4714cb8fb42336 */
/* loaded from: classes3.dex */
public final class f31 extends v4.s0 {
    public final /* synthetic */ n31 a;

    public f31(n31 n31Var) {
        this.a = n31Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        v4.s0 s0Var = this.a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i7);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        n31 n31Var = this.a;
        m31 m31Var = n31Var.s;
        c31 c31Var = n31Var.n;
        v4.s0 s0Var = n31Var.D;
        if (s0Var != null) {
            s0Var.b(c31Var, i7, i10);
        }
        if (i10 <= 0 || c31Var.getAdapter() != m31Var || !n31Var.J || m31Var.r || m31Var.s) {
            return;
        }
        if (n31Var.r.N0() >= ((m31Var.x + 1) - ((m31Var.w + 1) * 10)) - 1) {
            n31 n31Var2 = m31Var.y;
            if (!n31Var2.J || m31Var.r || m31Var.s) {
                return;
            }
            m31Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = m31Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(n31Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(m31Var, 16));
        }
    }
}
