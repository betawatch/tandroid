package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-6f2d76db22ca831bb15f086e4a1eed04c65c3f8086a2023f93e4a3f93807c96b */
/* loaded from: classes3.dex */
public final class m31 extends v4.s0 {
    public final /* synthetic */ u31 a;

    public m31(u31 u31Var) {
        this.a = u31Var;
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
        u31 u31Var = this.a;
        t31 t31Var = u31Var.s;
        j31 j31Var = u31Var.n;
        v4.s0 s0Var = u31Var.D;
        if (s0Var != null) {
            s0Var.b(j31Var, i7, i10);
        }
        if (i10 <= 0 || j31Var.getAdapter() != t31Var || !u31Var.J || t31Var.r || t31Var.s) {
            return;
        }
        if (u31Var.r.N0() >= ((t31Var.x + 1) - ((t31Var.w + 1) * 10)) - 1) {
            u31 u31Var2 = t31Var.y;
            if (!u31Var2.J || t31Var.r || t31Var.s) {
                return;
            }
            t31Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = t31Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(u31Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(t31Var, 16));
        }
    }
}
