package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-1f25b96fe9d12701c1febda7f3362f7edb2a81cc9281e2e56ab1ce93f20d85c1 */
/* loaded from: classes3.dex */
public final class b61 extends s4.r0 {
    public final /* synthetic */ i61 a;

    public b61(i61 i61Var) {
        this.a = i61Var;
    }

    @Override // s4.r0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.r0 r0Var = this.a.y;
        if (r0Var != null) {
            r0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.r0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        i61 i61Var = this.a;
        h61 h61Var = i61Var.s;
        y51 y51Var = i61Var.n;
        s4.r0 r0Var = i61Var.y;
        if (r0Var != null) {
            r0Var.b(y51Var, i10, i11);
        }
        if (i11 <= 0 || y51Var.getAdapter() != h61Var || !i61Var.J || h61Var.r || h61Var.s) {
            return;
        }
        if (i61Var.r.N0() >= ((h61Var.w + 1) - ((h61Var.v + 1) * 10)) - 1) {
            i61 i61Var2 = h61Var.x;
            if (!i61Var2.J || h61Var.r || h61Var.s) {
                return;
            }
            h61Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = h61Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(i61Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(h61Var, 17));
        }
    }
}
