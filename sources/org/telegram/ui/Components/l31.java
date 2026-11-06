package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-702b57c4013cb0412025c2ede91f131105e03fbb3968882e3fcf70e3b1090264 */
/* loaded from: classes3.dex */
public final class l31 extends v4.s0 {
    public final /* synthetic */ t31 a;

    public l31(t31 t31Var) {
        this.a = t31Var;
    }

    @Override // v4.s0
    public final void a(RecyclerView recyclerView, int i7) {
        v4.s0 s0Var = this.a.D;
        if (s0Var != null) {
            s0Var.a(recyclerView, i7);
        }
    }

    @Override // v4.s0
    public final void b(RecyclerView recyclerView, int i7, int i10) {
        t31 t31Var = this.a;
        s31 s31Var = t31Var.s;
        i31 i31Var = t31Var.n;
        v4.s0 s0Var = t31Var.D;
        if (s0Var != null) {
            s0Var.b(i31Var, i7, i10);
        }
        if (i10 <= 0 || i31Var.getAdapter() != s31Var || !t31Var.J || s31Var.r || s31Var.s) {
            return;
        }
        if (t31Var.r.N0() >= ((s31Var.x + 1) - ((s31Var.w + 1) * 10)) - 1) {
            t31 t31Var2 = s31Var.y;
            if (!t31Var2.J || s31Var.r || s31Var.s) {
                return;
            }
            s31Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = s31Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(t31Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(s31Var, 16));
        }
    }
}
