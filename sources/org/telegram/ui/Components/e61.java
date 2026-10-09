package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-e959fc77415b2a9f71493a2f526f1cffce04a1a9a22b5908f4d2a6356f8feb22 */
/* loaded from: classes3.dex */
public final class e61 extends s4.t0 {
    public final /* synthetic */ l61 a;

    public e61(l61 l61Var) {
        this.a = l61Var;
    }

    @Override // s4.t0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.t0 t0Var = this.a.y;
        if (t0Var != null) {
            t0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.t0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        l61 l61Var = this.a;
        k61 k61Var = l61Var.s;
        b61 b61Var = l61Var.n;
        s4.t0 t0Var = l61Var.y;
        if (t0Var != null) {
            t0Var.b(b61Var, i10, i11);
        }
        if (i11 <= 0 || b61Var.getAdapter() != k61Var || !l61Var.J || k61Var.r || k61Var.s) {
            return;
        }
        if (l61Var.r.N0() >= ((k61Var.w + 1) - ((k61Var.v + 1) * 10)) - 1) {
            l61 l61Var2 = k61Var.x;
            if (!l61Var2.J || k61Var.r || k61Var.s) {
                return;
            }
            k61Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = k61Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(l61Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new y1(k61Var, 17));
        }
    }
}
