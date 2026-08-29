package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-53ae6996d745fb61649afae8ef429049dda227e2aa02488fda2c3b459d1c2b94 */
/* loaded from: classes3.dex */
public final class l41 extends f2.a1 {
    public final /* synthetic */ s41 a;

    public l41(s41 s41Var) {
        this.a = s41Var;
    }

    @Override // f2.a1
    public final void a(RecyclerView recyclerView, int i10) {
        f2.a1 a1Var = this.a.y;
        if (a1Var != null) {
            a1Var.a(recyclerView, i10);
        }
    }

    @Override // f2.a1
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s41 s41Var = this.a;
        r41 r41Var = s41Var.s;
        i41 i41Var = s41Var.n;
        f2.a1 a1Var = s41Var.y;
        if (a1Var != null) {
            a1Var.b(i41Var, i10, i11);
        }
        if (i11 <= 0 || i41Var.getAdapter() != r41Var || !s41Var.F || r41Var.r || r41Var.s) {
            return;
        }
        if (s41Var.r.N0() >= ((r41Var.w + 1) - ((r41Var.v + 1) * 10)) - 1) {
            s41 s41Var2 = r41Var.x;
            if (!s41Var2.F || r41Var.r || r41Var.s) {
                return;
            }
            r41Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = r41Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(s41Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new a2(r41Var, 17));
        }
    }
}
