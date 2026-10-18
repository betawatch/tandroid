package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-bcc7d273da888d5c27994201329e5b838e55754b73312241608ee42846efd426 */
/* loaded from: classes3.dex */
public final class u51 extends s4.r0 {
    public final /* synthetic */ b61 a;

    public u51(b61 b61Var) {
        this.a = b61Var;
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
        b61 b61Var = this.a;
        a61 a61Var = b61Var.s;
        r51 r51Var = b61Var.n;
        s4.r0 r0Var = b61Var.y;
        if (r0Var != null) {
            r0Var.b(r51Var, i10, i11);
        }
        if (i11 <= 0 || r51Var.getAdapter() != a61Var || !b61Var.J || a61Var.r || a61Var.s) {
            return;
        }
        if (b61Var.r.N0() >= ((a61Var.w + 1) - ((a61Var.v + 1) * 10)) - 1) {
            b61 b61Var2 = a61Var.x;
            if (!b61Var2.J || a61Var.r || a61Var.s) {
                return;
            }
            a61Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = a61Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(b61Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(a61Var, 17));
        }
    }
}
