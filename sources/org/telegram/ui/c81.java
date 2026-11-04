package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

/* compiled from: r8-map-id-9e8ddc1fa2211541fa3d536e420570c3b9cfb819ea8a2b18c8dd2f7410191ee4 */
/* loaded from: classes3.dex */
public final class c81 extends org.telegram.ui.Components.sj0 {
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public b81 e;
    public int f;
    public final /* synthetic */ d81 h;

    public c81(d81 d81Var) {
        this.h = d81Var;
    }

    @Override // org.telegram.ui.Components.sj0
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override // u4.h0
    public final int b() {
        return this.c.size();
    }

    @Override // u4.h0
    public final void t(u4.d1 d1Var, int i3) {
        ArrayList arrayList = this.c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i3);
        String str = (String) this.d.get(i3);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.a;
        h4Var.e(chat, chat.title, str, i3 != arrayList.size() - 1);
        h4Var.c(this.h.x.contains(Long.valueOf(chat.id)), false);
    }

    @Override // u4.h0
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new org.telegram.ui.Components.bj0(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
