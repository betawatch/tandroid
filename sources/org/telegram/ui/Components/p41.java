package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-4bb4254c3f909a6aa06dac2c65babe2119e031935d92dfb0e270cca8f5968401 */
/* loaded from: classes3.dex */
public final class p41 extends s4.s0 {
    public final /* synthetic */ x41 a;

    public p41(x41 x41Var) {
        this.a = x41Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        x41 x41Var = this.a;
        w41 w41Var = x41Var.s;
        m41 m41Var = x41Var.n;
        s4.s0 s0Var = x41Var.D;
        if (s0Var != null) {
            s0Var.b(m41Var, i10, i11);
        }
        if (i11 <= 0 || m41Var.getAdapter() != w41Var || !x41Var.J || w41Var.r || w41Var.s) {
            return;
        }
        if (x41Var.r.N0() >= ((w41Var.x + 1) - ((w41Var.w + 1) * 10)) - 1) {
            x41 x41Var2 = w41Var.y;
            if (!x41Var2.J || w41Var.r || w41Var.s) {
                return;
            }
            w41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = w41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(x41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(w41Var, 16));
        }
    }
}
