package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-20b6edc21a21e9633bf1653677d767a6060e6d78c777eedeb9e70c0d9e4777a4 */
/* loaded from: classes3.dex */
public final class d41 extends v4.u0 {
    public final /* synthetic */ k41 a;

    public d41(k41 k41Var) {
        this.a = k41Var;
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
        k41 k41Var = this.a;
        j41 j41Var = k41Var.s;
        a41 a41Var = k41Var.n;
        v4.u0 u0Var = k41Var.E;
        if (u0Var != null) {
            u0Var.b(a41Var, i7, i10);
        }
        if (i10 <= 0 || a41Var.getAdapter() != j41Var || !k41Var.K || j41Var.r || j41Var.s) {
            return;
        }
        if (k41Var.r.N0() >= ((j41Var.x + 1) - ((j41Var.w + 1) * 10)) - 1) {
            k41 k41Var2 = j41Var.y;
            if (!k41Var2.K || j41Var.r || j41Var.s) {
                return;
            }
            j41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = j41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(k41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new f2(j41Var, 16));
        }
    }
}
