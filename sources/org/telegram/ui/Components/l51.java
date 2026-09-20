package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-eaaffe05e5b4975c35db95ddc7f057e1a9a0a254a43fe066fa0ad675f8b3973e */
/* loaded from: classes3.dex */
public final class l51 extends s4.s0 {
    public final /* synthetic */ s51 a;

    public l51(s51 s51Var) {
        this.a = s51Var;
    }

    @Override // s4.s0
    public final void a(RecyclerView recyclerView, int i10) {
        s4.s0 s0Var = this.a.y;
        if (s0Var != null) {
            s0Var.a(recyclerView, i10);
        }
    }

    @Override // s4.s0
    public final void b(RecyclerView recyclerView, int i10, int i11) {
        s51 s51Var = this.a;
        r51 r51Var = s51Var.s;
        i51 i51Var = s51Var.n;
        s4.s0 s0Var = s51Var.y;
        if (s0Var != null) {
            s0Var.b(i51Var, i10, i11);
        }
        if (i11 <= 0 || i51Var.getAdapter() != r51Var || !s51Var.J || r51Var.r || r51Var.s) {
            return;
        }
        if (s51Var.r.N0() >= ((r51Var.w + 1) - ((r51Var.v + 1) * 10)) - 1) {
            s51 s51Var2 = r51Var.x;
            if (!s51Var2.J || r51Var.r || r51Var.s) {
                return;
            }
            r51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = r51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(s51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(r51Var, 17));
        }
    }
}
