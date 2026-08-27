package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-818410c928e26989539d9c43666f59979e404aa44db880373fadfbe90836d366 */
/* loaded from: classes3.dex */
public final class c41 extends f2.b1 {
    public final /* synthetic */ j41 a;

    public c41(j41 j41Var) {
        this.a = j41Var;
    }

    @Override // f2.b1
    public final void a(RecyclerView recyclerView, int i10) {
        f2.b1 b1Var = this.a.y;
        if (b1Var != null) {
            b1Var.a(recyclerView, i10);
        }
    }

    @Override // f2.b1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        j41 j41Var = this.a;
        i41 i41Var = j41Var.s;
        z31 z31Var = j41Var.n;
        f2.b1 b1Var = j41Var.y;
        if (b1Var != null) {
            b1Var.b(z31Var, i10, i11);
        }
        if (i11 <= 0 || z31Var.getAdapter() != i41Var || !j41Var.F || i41Var.r || i41Var.s) {
            return;
        }
        if (j41Var.r.N0() >= ((i41Var.w + 1) - ((i41Var.v + 1) * 10)) - 1) {
            j41 j41Var2 = i41Var.x;
            if (!j41Var2.F || i41Var.r || i41Var.s) {
                return;
            }
            i41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = i41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(j41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new w1(i41Var, 17));
        }
    }
}
