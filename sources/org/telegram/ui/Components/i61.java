package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-64a75151e92f22d36d29b2bfeeae0e7839110b06f486211b30cdb3dbd2b83d42 */
/* loaded from: classes3.dex */
public final class i61 extends s4.u0 {
    public final /* synthetic */ p61 a;

    public i61(p61 p61Var) {
        this.a = p61Var;
    }

    @Override // s4.u0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.u0 u0Var = this.a.y;
        if (u0Var != null) {
            u0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.u0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        p61 p61Var = this.a;
        o61 o61Var = p61Var.s;
        f61 f61Var = p61Var.n;
        s4.u0 u0Var = p61Var.y;
        if (u0Var != null) {
            u0Var.b(f61Var, i10, i11);
        }
        if (i11 <= 0 || f61Var.getAdapter() != o61Var || !p61Var.J || o61Var.r || o61Var.s) {
            return;
        }
        if (p61Var.r.N0() >= ((o61Var.w + 1) - ((o61Var.v + 1) * 10)) - 1) {
            p61 p61Var2 = o61Var.x;
            if (!p61Var2.J || o61Var.r || o61Var.s) {
                return;
            }
            o61Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = o61Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(p61Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new b2(o61Var, 17));
        }
    }
}
