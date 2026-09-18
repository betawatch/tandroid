package org.telegram.ui.Components;

import androidx.recyclerview.widget.RecyclerView;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-c0e607070f32dbde65005355ff6c489b77f9395a3e0f8720848e2402860dea84 */
/* loaded from: classes3.dex */
public final class m51 extends s4.s0 {
    public final /* synthetic */ t51 a;

    public m51(t51 t51Var) {
        this.a = t51Var;
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
        t51 t51Var = this.a;
        s51 s51Var = t51Var.s;
        j51 j51Var = t51Var.n;
        s4.s0 s0Var = t51Var.y;
        if (s0Var != null) {
            s0Var.b(j51Var, i10, i11);
        }
        if (i11 <= 0 || j51Var.getAdapter() != s51Var || !t51Var.J || s51Var.r || s51Var.s) {
            return;
        }
        if (t51Var.r.N0() >= ((s51Var.w + 1) - ((s51Var.v + 1) * 10)) - 1) {
            t51 t51Var2 = s51Var.x;
            if (!t51Var2.J || s51Var.r || s51Var.s) {
                return;
            }
            s51Var.r = true;
            TLRPC.TL_messages_getOldFeaturedStickers tL_messages_getOldFeaturedStickers = new TLRPC.TL_messages_getOldFeaturedStickers();
            tL_messages_getOldFeaturedStickers.offset = s51Var.n.size();
            tL_messages_getOldFeaturedStickers.limit = 40;
            ConnectionsManager.getInstance(t51Var2.a).sendRequest(tL_messages_getOldFeaturedStickers, new x1(s51Var, 17));
        }
    }
}
