package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4133155207c006298c642c285ab3b5978923f03f939756047215603ba68bdf5b */
/* loaded from: classes3.dex */
public final class c41 extends v4.u0 {
    public final /* synthetic */ j41 a;

    public c41(j41 j41Var) {
        this.a = j41Var;
    }

    @Override // v4.u0
    public final void a(RecyclerView recyclerView, int i7) {
        v4.u0 u0Var = this.a.E;
        if (u0Var != null) {
            u0Var.a(recyclerView, i7);
        }
    }

    @Override // v4.u0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        j41 j41Var = this.a;
        i41 i41Var = j41Var.s;
        z31 z31Var = j41Var.n;
        v4.u0 u0Var = j41Var.E;
        if (u0Var != null) {
            u0Var.b(z31Var, i7, i10);
        }
        if (i10 <= 0 || z31Var.getAdapter() != i41Var || !j41Var.K || i41Var.r || i41Var.s) {
            return;
        }
        if (j41Var.r.N0() >= ((i41Var.x + 1) - ((i41Var.w + 1) * 10)) - 1) {
            j41 j41Var2 = i41Var.y;
            if (!j41Var2.K || i41Var.r || i41Var.s) {
                return;
            }
            i41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = i41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(j41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new e2(i41Var, 16));
        }
    }
}
