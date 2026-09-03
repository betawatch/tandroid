package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-33f3ee7b3837766f245c82aac5a618a539713405f9dc265162d35c247069ed49 */
/* loaded from: classes3.dex */
public final class x41 extends f2.z0 {
    public final /* synthetic */ e51 a;

    public x41(e51 e51Var) {
        this.a = e51Var;
    }

    @Override // f2.z0
    public final void a(RecyclerView recyclerView, int i10) {
        f2.z0 z0Var = this.a.y;
        if (z0Var != null) {
            z0Var.a(recyclerView, i10);
        }
    }

    @Override // f2.z0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        e51 e51Var = this.a;
        d51 d51Var = e51Var.s;
        u41 u41Var = e51Var.n;
        f2.z0 z0Var = e51Var.y;
        if (z0Var != null) {
            z0Var.b(u41Var, i10, i11);
        }
        if (i11 <= 0 || u41Var.getAdapter() != d51Var || !e51Var.G || d51Var.r || d51Var.s) {
            return;
        }
        if (e51Var.r.N0() >= ((d51Var.w + 1) - ((d51Var.v + 1) * 10)) - 1) {
            e51 e51Var2 = d51Var.x;
            if (!e51Var2.G || d51Var.r || d51Var.s) {
                return;
            }
            d51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = d51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(e51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(d51Var, 17));
        }
    }
}
